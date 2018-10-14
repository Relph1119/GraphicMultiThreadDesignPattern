package com.gmtdp.activeObject.exercise3.searcher;

public class SearcherFactory {
	public static Searcher createSearcher() {
		return new SearcherImpl();
	}
}
