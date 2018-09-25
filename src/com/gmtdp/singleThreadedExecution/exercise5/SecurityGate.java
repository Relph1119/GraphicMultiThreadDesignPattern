package com.gmtdp.singleThreadedExecution.exercise5;

public class SecurityGate {
	private int counter = 0;
	
	public void enter() {
		int currentCounter = counter;
		Thread.yield();
		counter = currentCounter + 1;
	}
	
	public void exit() {
		int currentCounter = counter;
		Thread.yield();
		counter = currentCounter - 1;
	}
	
	public int getCounter() {
		return counter;
	}
}
