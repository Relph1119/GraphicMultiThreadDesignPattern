package com.gmtdp.producerConsumer.exercise7;

public class Main {

	public static void main(String[] args) {
		Thread executor = new Thread() {
			@Override
			public void run() {
				System.out.println("Host.execute BEGIN");
				try {
					Host.execute(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Host.execute END");
			}
		};
		
		executor.start();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("***** interrupt *****");
		executor.interrupt();
	}

}
