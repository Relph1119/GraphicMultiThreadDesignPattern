package com.gmtdp.twoPhaseTermination.exercise3;

import java.io.FileWriter;

public class CountupThread extends Thread {
	private long counter = 0;
	
	private volatile boolean shutdownRequested = false;
	
	public void shutdownRequest() {
		shutdownRequested = true;
		interrupt();
	}
	
	public boolean isShutdownRequested() {
		return shutdownRequested;
	}
	
	@Override
	public final void run() {
		try {
			while(!shutdownRequested) {
				doWork();
			}
		} catch (InterruptedException e) {
		} finally {
			doShutdown();
		}
	}

	private void doWork() throws InterruptedException{
		counter++;
		System.out.println("doWork: counter = " + counter);
		Thread.sleep(500);
	}
	
	private void doShutdown() {
		System.out.println("doShutdown: counter = " + counter);
		System.out.println("doShutdown: Save BEGIN");
		try {
			FileWriter writer = new FileWriter("static/counter.txt");
			writer.write("counter = " + counter);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("doShutdown: Save END");
	}
	
	
}
