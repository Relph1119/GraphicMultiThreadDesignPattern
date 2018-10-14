package com.gmtdp.activeObject.exercise2_1;

import com.gmtdp.activeObject.exercise2_1.activeobject.ActiveObject;
import com.gmtdp.activeObject.exercise2_1.activeobject.Result;

public class AddClientThread extends Thread {
	private final ActiveObject activeObject;
	private String x = "1";
	private String y = "1";
	public AddClientThread(String name, ActiveObject activeObject) {
		super(name);
		this.activeObject = activeObject;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; true; i++) {
				Result<String> result = activeObject.add(x, y);
				Thread.sleep(100);
				String z = result.getResultValue();
				System.out.println(Thread.currentThread().getName() + ":" + x + " " + y + " = " + z);
				x = y;
				y = z;
			}
		} catch (InterruptedException e) {
		}
	}
	
}
