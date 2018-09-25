package com.gmtdp.singleThreadedExecution.exercise6;

public class Main {

	public static void main(String[] args) {
		System.out.println("Testing EaterThread, hit CTRL+C to exit.");
		Tool spoon = new Tool("Spoon");
		Tool fork = new Tool("Fork");
		new EaterThread("Alice", spoon, fork).start();
		//new EaterThread("Bobby", fork, spoon).start();
		//Method 1
		new EaterThread("Bobby", spoon, fork).start();
	}

}
