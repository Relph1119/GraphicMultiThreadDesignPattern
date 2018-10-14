package com.gmtdp.activeObject.exercise2_1.activeobject;

public class SchedulerThread extends Thread {
	
	private final ActivationQueue queue;
	
	public SchedulerThread(ActivationQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			MethodRequest request = queue.takeRequest();
			request.execute();
		}
	}

	public void invoke(MethodRequest request) {
		queue.putRequest(request);
	}

}
