package com.gmtdp.activeObject.jucSample;

import com.gmtdp.activeObject.jucSample.activeobject.ActiveObject;
import com.gmtdp.activeObject.jucSample.activeobject.ActiveObjectFactory;

public class Main {
	public static void main(String[] args) {
		ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
		try {
			new MakerClientThread("Alice", activeObject).start();
			new MakerClientThread("Bobby", activeObject).start();
			new DisplayClientThread("Chris", activeObject).start();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} finally {
			System.out.println("*** shutdown ***");
			activeObject.shutdown();
		}
		
		
	}
}
