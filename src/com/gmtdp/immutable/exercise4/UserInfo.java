package com.gmtdp.immutable.exercise4;

public class UserInfo {
	private final StringBuffer info;
	public UserInfo(String name, String address) {
		this.info = new StringBuffer("<info name=\"" + name + "\" address=\"" + address + "\" />");
	}
	
	public StringBuffer getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return "UserInfo [info=" + info + "]";
	}
	
}
