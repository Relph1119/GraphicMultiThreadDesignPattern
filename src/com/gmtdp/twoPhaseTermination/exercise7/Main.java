package com.gmtdp.twoPhaseTermination.exercise7;

public class Main {
	public static void main(String[] args) {
		System.out.println("main: BEGIN");
		try {
			HanoiThread t = new HanoiThread();
			t.start();
			
			Thread.sleep(10000);
			
			System.out.println("main: shutdownRequest");
			t.shutdownRequest();
			
			System.out.println("main: join");
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main: END");
	}
}
