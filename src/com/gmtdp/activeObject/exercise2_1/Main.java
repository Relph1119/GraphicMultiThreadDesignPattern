package com.gmtdp.activeObject.exercise2_1;

import com.gmtdp.activeObject.exercise2_1.activeobject.ActiveObject;
import com.gmtdp.activeObject.exercise2_1.activeobject.ActiveObjectFactory;

public class Main {
	public static void main(String[] args) {
		ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
		new AddClientThread("Diana", activeObject).start();
	}
}
