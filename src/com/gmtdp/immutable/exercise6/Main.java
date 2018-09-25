package com.gmtdp.immutable.exercise6;

public class Main {
	public static void main(String[] args) {
		MutablePerson mutable = new MutablePerson("start", "start");
		new CrackerThread(mutable).start();
		new CrackerThread(mutable).start();
		new CrackerThread(mutable).start();
		for(int i = 0; true; i++) {
			mutable.setPerson(String.valueOf(i), String.valueOf(i));
		}
	}
}

class CrackerThread extends Thread {
	private final MutablePerson mutable;
	public CrackerThread(MutablePerson mutable) {
		this.mutable = mutable;
	}
	
	@Override
	public void run() {
		while(true) {
			ImmutablePerson immutable = new ImmutablePerson(mutable);
			if(!immutable.getName().equals(immutable.getAddress())) {
				System.out.println(currentThread().getName() + "****** BROKEN ******" + immutable);
			}
		}
	}
}
