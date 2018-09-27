package com.gmtdp.balking.exercise5;

public class TestThread extends Thread {
	@Override
	public void run() {
		System.out.print("BEGIN");
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
		System.out.print("END");
	}
}	
