package com.gmtdp.singleThreadedExecution.exercise5;

public class CrackerThread extends Thread {
	private final SecurityGate gate;

	public CrackerThread(SecurityGate gate) {
		this.gate = gate;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			gate.enter();
			gate.exit();
		}
	}
}
