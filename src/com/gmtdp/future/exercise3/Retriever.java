package com.gmtdp.future.exercise3;

public class Retriever {
	public static Content retrieve(final String urlStr) {
		final AsyncContentImpl future = new AsyncContentImpl();
		
		new Thread() {
			public void run() {
				future.setContent(new SyncContentImpl(urlStr));
			};
		}.start();
		return future;
	}
}
