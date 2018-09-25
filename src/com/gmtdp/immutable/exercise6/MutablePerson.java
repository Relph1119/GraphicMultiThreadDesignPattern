package com.gmtdp.immutable.exercise6;

public final class MutablePerson {
	private String name;
	private String address;
	
	public MutablePerson(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public MutablePerson(ImmutablePerson person) {
		this.name = person.getName();
		this.address = person.getAddress();
	}
	
	public synchronized void setPerson(String newName, String newAddress) {
		name = newName;
		address = newAddress;
	}
	
	public synchronized ImmutablePerson getImmutablePerson() {
		return new ImmutablePerson(this);
	}
	
	String getName() {
		return name;
	}
	
	String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "MutablePerson [name=" + name + ", address=" + address + "]";
	}
	
}
