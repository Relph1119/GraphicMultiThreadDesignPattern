package com.gmtdp.threadSpecificStorage.sample2;

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
		}
		
		return tsLog;
	}
}
