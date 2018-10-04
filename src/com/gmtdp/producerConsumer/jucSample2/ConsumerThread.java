package com.gmtdp.producerConsumer.jucSample2;

import java.util.Random;
import java.util.concurrent.Exchanger;

public class ConsumerThread extends Thread {
	private final Exchanger<char[]> exchanger;
	private char[] buffer = null;
	private final Random random;
	
	public ConsumerThread(Exchanger<char[]> exchanger, char[] buffer, long seed) {
		super("ConsumerThread");
		this.exchanger = exchanger;
		this.buffer = buffer;
		this.random = new Random(seed);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(Thread.currentThread().getName() + ": BEFORE exchange");
				buffer = exchanger.exchange(buffer);
				System.out.println(Thread.currentThread().getName() + ": AFTER exchange");
				
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(Thread.currentThread().getName() + ": -> " + buffer[i]);
					Thread.sleep(random.nextInt(1000));
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
