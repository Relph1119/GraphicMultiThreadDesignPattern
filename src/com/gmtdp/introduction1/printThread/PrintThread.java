package com.gmtdp.introduction1.printThread;

public class PrintThread extends Thread {
	private String message;
	public PrintThread(String message) {
		this.message = message;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.print(message);
		}
	}
	
	
}
