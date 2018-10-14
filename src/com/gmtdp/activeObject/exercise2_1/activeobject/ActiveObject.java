package com.gmtdp.activeObject.exercise2_1.activeobject;

public interface ActiveObject {

	public abstract Result<String> makeString(int i, char fillchar);

	public abstract void displayString(String string);

	public abstract Result<String> add(String x, String y);
	
}
