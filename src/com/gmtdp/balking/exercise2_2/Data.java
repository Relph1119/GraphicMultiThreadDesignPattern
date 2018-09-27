package com.gmtdp.balking.exercise2_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.attribute.DosFileAttributeView;

public class Data {
	private final String fileName;
	private String content;
	private boolean changed;
	
	public Data(String fileName, String content) {
		this.fileName = fileName;
		this.content = content;
		this.changed = true;
	}
	
	public synchronized void change(String newContent) {
		content = newContent;
		changed = true;
	}
	
	public void save() throws IOException{
		if(!changed) {
			return;
		}
		doSave();
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		changed = false;
	}
	
	private void doSave() throws IOException {
		System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
		Writer writer = new FileWriter(fileName);
		writer.write(content);
		writer.close();
	}
}
