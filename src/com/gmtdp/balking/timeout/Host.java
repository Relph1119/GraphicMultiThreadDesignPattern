package com.gmtdp.balking.timeout;

import java.util.concurrent.TimeoutException;

public class Host {
	private final long timeout;
	private boolean ready = false;
	
	public Host(long timeout) {
		this.timeout = timeout;
	}
	
	public synchronized void setExecuteable(boolean on) {
		ready = on;
		notifyAll();
	}
	
	public synchronized void execute() throws InterruptedException, TimeoutException {
		long start = System.currentTimeMillis();
		while(!ready) {
			long now = System.currentTimeMillis();
			long rest = timeout - (now - start);
			if(rest <= 0) {
				throw new TimeoutException("now - start = " + (now - start) + ", timeout = " + timeout);
			}
			wait(rest);
		}
		doExecute();
	}
	
	private void doExecute() {
		System.out.println(Thread.currentThread().getName() + " calls doExecute");
	}
	
}
