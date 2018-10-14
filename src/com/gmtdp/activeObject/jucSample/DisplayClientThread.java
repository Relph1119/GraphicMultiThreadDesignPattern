package com.gmtdp.activeObject.jucSample;

import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;

import com.gmtdp.activeObject.jucSample.activeobject.ActiveObject;

public class DisplayClientThread extends Thread{
	
	private final ActiveObject activeObject;
	
	public DisplayClientThread(String name, ActiveObject activeObject) {
		super(name);
		this.activeObject = activeObject;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; true; i++) {
				String string = Thread.currentThread().getName() + " " + i;
				activeObject.displayString(string);
				Thread.sleep(200);
			}
		} catch (RejectedExecutionException e) {
			System.out.println(Thread.currentThread().getName() + ":" + e);
		} catch (CancellationException e) {
			System.out.println(Thread.currentThread().getName() + ":" + e);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ":" + e);
		}
	}

}
