package com.gmtdp.threadSpecificStorage.exercise3;

public class Log {
	private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<>();
	
	public static void println(String s) {
		getTSLog().println(s);
	}
	
	public static void close() {
		getTSLog().close();
	}
	
	private static TSLog getTSLog() {
		TSLog tsLog = tsLogCollection.get();
		
		if(tsLog == null) {
			tsLog = new TSLog("static/" + Thread.currentThread().getName() + "-log.txt");
			tsLogCollection.set(tsLog);
			startWatcher(tsLog);
		}
		
		return tsLog;
	}

	private static void startWatcher(final TSLog tsLog) {
		final Thread target = Thread.currentThread();
		final Thread watcher = new Thread() {
			public void run() {
				System.out.println("startWathcer for " + target.getName() + " BEGIN");
				try {
					target.join();
				} catch (InterruptedException e) {
				}
				tsLog.close();
				System.out.println("startWathcer for " + target.getName() + " END");
			};
		};
		watcher.start();
	}
}
