package com.gmtdp.future.exercise3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Content content1 = Retriever.retrieve("http://www.google.cn/");
		Content content2 = Retriever.retrieve("https://www.baidu.com/");
		Content content3 = Retriever.retrieve("http://www.hyuki.com/");
		
		saveToFile("static/google.html", content1);
		saveToFile("static/baidu.html", content2);
		saveToFile("static/hyuki.html", content3);
		
		long end = System.currentTimeMillis();
		System.out.println("Elapsed time = " + (end - start) + " msec.");
	}

	private static void saveToFile(String fileName, Content content) {
		byte[] bytes = content.getBytes();
		try {
			System.out.println(Thread.currentThread().getName() + ": Saving to " + fileName);
			FileOutputStream out = new FileOutputStream(fileName);
			for (int i = 0; i < bytes.length; i++) {
				out.write(bytes[i]);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
