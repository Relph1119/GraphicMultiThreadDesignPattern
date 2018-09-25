package com.gmtdp.introduction1.exercise4;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank(1000, "A Bad Bank");
		new ClientThread(bank).start();
		new ClientThread(bank).start();
	}

}
