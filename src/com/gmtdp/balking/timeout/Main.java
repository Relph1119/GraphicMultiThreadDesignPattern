package com.gmtdp.balking.timeout;

import java.util.concurrent.TimeoutException;

public class Main {

	public static void main(String[] args) {
		Host host = new Host(10000);
		try {
			System.out.println("execute BEGIN");
			host.execute();
		} catch (InterruptedException | TimeoutException e) {
			e.printStackTrace();
		}
	}

}
