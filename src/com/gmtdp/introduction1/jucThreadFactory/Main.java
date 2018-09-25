package com.gmtdp.introduction1.jucThreadFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.gmtdp.introduction1.printer.Printer;

public class Main {
	public static void main(String[] args) {
		ThreadFactory factory = Executors.defaultThreadFactory();
		factory.newThread(new Printer("Nice!")).start();
		for (int i = 0; i < 10000; i++) {
			System.out.print("Good!");
		}
	}
}
