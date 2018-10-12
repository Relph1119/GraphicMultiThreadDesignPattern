package com.gmtdp.future.exercise3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class SyncContentImpl implements Content {
	
	private byte[] contentBytes;
	
	public SyncContentImpl(String urlStr) {
		System.out.println(Thread.currentThread().getName() + ": Getting " + urlStr);
		try {
			StringBuffer buffer = new StringBuffer();
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();    
	        conn.connect();  
	        InputStream inputStream = conn.getInputStream();
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            String result = buffer.toString();
            contentBytes = result.getBytes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public byte[] getBytes() {
		return contentBytes;
	}

}
