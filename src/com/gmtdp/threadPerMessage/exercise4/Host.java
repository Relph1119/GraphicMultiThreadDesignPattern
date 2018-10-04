package com.gmtdp.threadPerMessage.exercise4;

public class Host {
	private final Helper helper = new Helper();
	public void request(final int count, final char c) {
		System.out.println("      request(" + count + ", " + c + ") BEGIN");
		new HelpThread(helper, count, c).start();
		System.out.println("      request(" + count + ", " + c + ") END");
	}
}
