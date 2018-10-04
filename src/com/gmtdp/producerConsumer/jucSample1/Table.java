package com.gmtdp.producerConsumer.jucSample1;

import java.util.concurrent.ArrayBlockingQueue;

public class Table extends ArrayBlockingQueue<String>{
	
	public Table(int count) {
		super(count);
	}
	
	public synchronized void put(String cake) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " puts " + cake);
		super.put(cake);
	}
	
	public synchronized String take() throws InterruptedException {
		String cake = super.take();
		System.out.println(Thread.currentThread().getName() + " takes " + cake);
		return cake;
	}
}
