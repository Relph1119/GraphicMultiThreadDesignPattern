package com.gmtdp.guardedSuspension.exercise6;

import java.util.Random;

public class ClientThread extends Thread {
	private final Random random;
	private final RequestQueue requestQueue;
	
	public ClientThread(RequestQueue requestQueue, String name, long seed) {
		super(name);
		this.requestQueue = requestQueue;
		this.random = new Random(seed);
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10000; i++) {
				Request request = new Request("No." + i);
				System.out.println(Thread.currentThread().getName() + " requests " + request);
				requestQueue.putRequest(request);
				Thread.sleep(random.nextInt(1000));
			}
		} catch (InterruptedException e) {
		}
		
	}
}
