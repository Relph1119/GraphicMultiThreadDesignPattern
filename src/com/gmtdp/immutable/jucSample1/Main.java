package com.gmtdp.immutable.jucSample1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		new WriterThread(list).start();
		new ReaderThread(list).start();
	}

}
