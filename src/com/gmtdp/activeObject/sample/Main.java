package com.gmtdp.activeObject.sample;

import com.gmtdp.activeObject.sample.activeobject.ActiveObject;
import com.gmtdp.activeObject.sample.activeobject.ActiveObjectFactory;

public class Main {
	public static void main(String[] args) {
		ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
		new MakerClientThread("Alice", activeObject).start();
		new MakerClientThread("Bobby", activeObject).start();
		new DisplayClientThread("Chris", activeObject).start();
	}
}
