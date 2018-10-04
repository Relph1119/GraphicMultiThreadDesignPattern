package com.gmtdp.readWriteLock.exercise4;

import java.util.concurrent.atomic.AtomicInteger;

public class RetrieveThread extends Thread {
	private final Database<String, String> database;
	private final String key;
	private static final AtomicInteger atomicCounter = new AtomicInteger(0);
	
	public RetrieveThread(Database<String, String> database, String key) {
		this.database = database;
		this.key = key;
	}
	
	@Override
	public void run() {
		while(true) {
			int counter = atomicCounter.incrementAndGet();
			String value = database.retrieve(key);
			System.out.println(counter + ":" + key + " => " + value);
		}
	}
}
