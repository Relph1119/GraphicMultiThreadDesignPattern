package com.gmtdp.threadPerMessage.jucSample4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println("main BEGIN");
		Host host = new Host(Executors.defaultThreadFactory());
		host.request(10, 'A');
		host.request(20, 'B');
		host.request(30, 'C');
		System.out.println("main END");
	}

}
