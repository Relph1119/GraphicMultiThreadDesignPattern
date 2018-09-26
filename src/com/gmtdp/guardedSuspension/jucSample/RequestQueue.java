package com.gmtdp.guardedSuspension.jucSample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class RequestQueue {
	private final BlockingQueue<Request> queue = new LinkedBlockingQueue<>();
	
	public Request getRequest() {
		Request request = null;
		try {
			request = queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return request;
	}
	
	public void putRequest(Request request) {
		try {
			queue.put(request);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
