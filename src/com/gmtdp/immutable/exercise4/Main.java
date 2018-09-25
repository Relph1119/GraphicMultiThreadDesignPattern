package com.gmtdp.immutable.exercise4;

public class Main {
	
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo("Alice", "Alaska");
		System.out.println("userInfo = " + userInfo);
		StringBuffer info = userInfo.getInfo();
		info.replace(12, 17, "Bobby");
		System.out.println("userInfo = " + userInfo);
	}

}
