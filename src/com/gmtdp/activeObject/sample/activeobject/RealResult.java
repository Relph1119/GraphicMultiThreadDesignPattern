package com.gmtdp.activeObject.sample.activeobject;

class RealResult<T> extends Result<T> {
	private final T resultVaule;

	public RealResult(T resultVaule) {
		this.resultVaule = resultVaule;
	}
	
	public T getResultValue() {
		return resultVaule;
	}
	
}
