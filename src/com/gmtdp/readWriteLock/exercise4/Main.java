package com.gmtdp.readWriteLock.exercise4;

public class Main {

	public static void main(String[] args) {
		Database<String, String> database = new Database<>();
		
		new AssignThread(database, "Alice", "Alaska").start();
		new AssignThread(database, "Alice", "Australia").start();
		new AssignThread(database, "Bobby", "Brazil").start();
		new AssignThread(database, "Bobby", "Bulgaria").start();
		
		for (int i = 0; i < 100; i++) {
			new RetrieveThread(database, "Alice").start();
			new RetrieveThread(database, "Bobby").start();
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		
		System.exit(0);
	}

}
