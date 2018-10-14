package com.gmtdp.activeObject.exercise2_2;

import com.gmtdp.activeObject.exercise2_2.activeobject.ActiveObject;
import com.gmtdp.activeObject.exercise2_2.activeobject.ActiveObjectFactory;

public class Main {
	public static void main(String[] args) {
		ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
		try {
			new AddClientThread("Diana", activeObject).start();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} finally {
			System.out.println("*** shutdown ***");
			activeObject.shutdown();
		}
		
		
	}
}
