package com.gmtdp.twoPhaseTermination.exercise7;

import java.nio.channels.InterruptedByTimeoutException;

public class HanoiThread extends Thread {
	private volatile boolean shutdownRequested = false;
	
	private volatile long requestedTimeMillis = 0;
	
	public void shutdownRequest() {
		requestedTimeMillis = System.currentTimeMillis();
		shutdownRequested = true;
		interrupt();
	}
	
	public boolean isShutdownRequested() {
		return shutdownRequested;
	}
	
	@Override
	public void run() {
		try {
			for (int level = 0; !isShutdownRequested(); level++) {
				System.out.println("==== Level " + level + " ====");
				doWork(level, 'A', 'B', 'C');
				System.out.println("");
			}
		} catch (Exception e) {
		} finally {
			doShutdown();
		}
	}

	private void doShutdown() {
		long time = System.currentTimeMillis() - requestedTimeMillis;
		System.out.println("doShutdown: Latency = " + time + " msec.");
	}

	private void doWork(int level, char posA, char posB, char posC) throws InterruptedException {
		if(level > 0) {
			if(isShutdownRequested()) {
				throw new InterruptedException();
			}
			doWork(level - 1, posA, posB, posC);
			System.out.print(posA + "->" + posB + " ");
			doWork(level - 1, posC, posB, posA);
		}
	}
	
	
}
