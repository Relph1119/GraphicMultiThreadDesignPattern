package com.gmtdp.activeObject.exercise2_2.activeobject;

import java.util.concurrent.Future;

public interface ActiveObject {

	public abstract Future<String> makeString(int count, char fillchar);

	public abstract void displayString(String string);
	public abstract void shutdown();

	public abstract Future<String> add(String x, String y);
}
