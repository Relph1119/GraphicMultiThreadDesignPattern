package com.gmtdp.immutable.jucSample3;

import java.util.List;

public class ReaderThread extends Thread {
	private final List<Integer> list;
	public ReaderThread(List<Integer> list) {
		super("ReaderThread");
		this.list = list;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
				for (int n : list) {
					System.out.println(n);
				}
			}
		}
	}
}
