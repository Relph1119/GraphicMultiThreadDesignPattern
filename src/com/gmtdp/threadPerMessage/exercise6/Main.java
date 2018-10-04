package com.gmtdp.threadPerMessage.exercise6;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			new MiniServer(3000).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
