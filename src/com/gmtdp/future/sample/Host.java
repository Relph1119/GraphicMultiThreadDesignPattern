package com.gmtdp.future.sample;

public class Host {
	public Data request(final int count, final char c) {
		System.out.println("    request(" + count + ", " + c + ") BEGIN");
		
		final FutureData future = new FutureData();
		
		new Thread() {
			public void run() {
				RealData realData = new RealData(count, c);
				future.setRealData(realData);
			};
		}.start();
		System.out.println("    request(" + count + ", " + c + ") END");
		
		return future;
		
	}
}
