package com.gmtdp.introduction1.exercise4;

public class Bank {
	private int money;
	private String name;
	
	public Bank(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	public void deposit(int m) {
		money += m;
	}
	
	public boolean withdraw(int m) {
		if(money >= m) {
			money -= m;
			check();
			return true;
		} else {
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	
	private void check() {
		if(money < 0) {
			System.out.print("可用余额为负数!money = " + money);
		}
	}
}
