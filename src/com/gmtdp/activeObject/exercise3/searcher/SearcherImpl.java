package com.gmtdp.activeObject.exercise3.searcher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearcherImpl extends Searcher {
	private final ExecutorService service = Executors.newSingleThreadExecutor();
	
	public void shutdown() {
		service.shutdown();
	}
	
	@Override
	public void search(final String word, final Display display) {
		class SearchRequest implements Runnable {

			@Override
			public void run() {
				System.out.print("search(" + word + ")");
				for (int i = 0; i < 50; i++) {
					System.out.print(".");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				System.out.println("found.");
				String url = "http://somewhere/" + word + ".html";
				display.display("word = " + word + ", URL = " + url);
			}
		}
		service.execute(new SearchRequest());
	}

}
