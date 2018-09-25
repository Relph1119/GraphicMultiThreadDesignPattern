package com.gmtdp.singleThreadedExecution.exercise5;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Testing SecurityGate...");
		for (int trial = 0; true; trial++) {
			SecurityGate gate = new SecurityGate();
			CrackerThread[] t = new CrackerThread[5];
			
			for (int i = 0; i < t.length; i++) {
				t[i] = new CrackerThread(gate);
				t[i].start();
			}
			
			for (int i = 0; i < t.length; i++) {
				try {
					t[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if(gate.getCounter() == 0) {
				System.out.print(".");
			} else {
				System.out.println("SecurityGate is NOT safe!");
				System.out.println("getCounter() == " + gate.getCounter());
				System.out.println("trail = " + trial);
				break;
			}
		}
	}

}
