package com.gmtdp.twoPhaseTermination.exercise5;

public class Service {
	
	private static GracefulThread thread = null;
	
	public static void service() {
		System.out.print("service");
		if (thread != null && thread.isAlive()) {
			System.out.println(" is balked");
			return;
		}
		thread = new ServiceThread();
		thread.start();
	}
	
	public static void cancel() {
		if (thread != null) {
			System.out.println("cancel.");
			thread.shutdownRequest();
		}
	}
}
