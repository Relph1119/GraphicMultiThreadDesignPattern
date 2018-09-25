package com.gmtdp.immutable.sample;

public class PrintPersonThread extends Thread {
	private Person person;

	public PrintPersonThread(Person person) {
		this.person = person;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + " prints " + person);
		}
	}
	
}
