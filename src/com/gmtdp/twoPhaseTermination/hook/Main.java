package com.gmtdp.twoPhaseTermination.hook;

public class Main {

	public static void main(String[] args) {
		System.out.println("main:BEGIN");
		
		Thread.setDefaultUncaughtExceptionHandler(
			new Thread.UncaughtExceptionHandler() {
				
				@Override
				public void uncaughtException(Thread thread, Throwable exception) {
					System.out.println("****");
					System.out.println("UncaughtExceptionHander:BEGIN");
					System.out.println("currentThread = " + Thread.currentThread());
					System.out.println("thread = " + thread);
					System.out.println("exception = " + exception);
					System.out.println("UncaughtExceptionHandler:END");
				}
			}
		);
		
		Runtime.getRuntime().addShutdownHook(
			new Thread() {
				public void run() {
					System.out.println("****");
					System.out.println("shutdown hook:BEGIN");
					System.out.println("currentThread = " + Thread.currentThread());
					System.out.println("shutdown hook:END");
				};
			}
		);
		
		new Thread("MyThread") {
			public void run() {
				System.out.println("MyThread:BEGIN");
				System.out.println("MyThread:SLEEP...");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				
				System.out.println("MyThread:DIVIDE");
				
				int x = 1 / 0;
				System.out.println("MyThread:END");
			};
		}.start();
		
		System.out.println("main:END");
	}

}
