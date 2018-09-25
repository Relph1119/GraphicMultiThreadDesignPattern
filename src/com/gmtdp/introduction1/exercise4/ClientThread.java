package com.gmtdp.introduction1.exercise4;

public class ClientThread extends Thread {
	private Bank bank;

	public ClientThread(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		while(true) {
			boolean ok = bank.withdraw(1000);
			if(ok) {
				bank.deposit(1000);
			}
		}
	}
	
	
}
