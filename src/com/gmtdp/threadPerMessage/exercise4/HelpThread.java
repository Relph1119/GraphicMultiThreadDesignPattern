package com.gmtdp.threadPerMessage.exercise4;

public class HelpThread extends Thread{
	private final Helper helper;
	private final int count;
	private final char c;
	public HelpThread(Helper helper, int count, char c) {
		this.helper = helper;
		this.count = count;
		this.c = c;
	}
	
	@Override
	public void run() {
		helper.handle(count, c);
	}
}
