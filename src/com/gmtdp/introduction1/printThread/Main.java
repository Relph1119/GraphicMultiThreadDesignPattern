package com.gmtdp.introduction1.printThread;

public class Main {

	public static void main(String[] args) {
		new PrintThread("Good!").start();
		new PrintThread("Nice!").start();
	}

}
