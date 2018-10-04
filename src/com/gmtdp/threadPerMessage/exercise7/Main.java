package com.gmtdp.threadPerMessage.exercise7;

public class Main {
	public static void main(String[] args) {
		System.out.println("BEGIN");
		Object obj = new Object();
		Blackhole.enter(obj);
		System.out.println("END");
	}
}
