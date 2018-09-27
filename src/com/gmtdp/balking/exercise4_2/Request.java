package com.gmtdp.balking.exercise4_2;

public class Request {
	private final String name;
	public Request(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "[ Request " + name + "]";
	}
	
}
