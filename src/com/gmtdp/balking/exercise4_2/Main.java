package com.gmtdp.balking.exercise4_2;

public class Main {
	public static void main(String[] args) {
		RequestQueue requestQueue1 = new RequestQueue();
		RequestQueue requestQueue2 = new RequestQueue();
		requestQueue1.putRequest(new Request("Hello"));
		new TalkThread(requestQueue1, requestQueue2, "Alice").start();
		new TalkThread(requestQueue2, requestQueue1, "Bobby").start();
	}
}
