package com.gmtdp.activeObject.exercise2_1.activeobject;

class MakeStringRequest extends MethodRequest<String>{
	private final int count;
	private final char fillchar;
	
	public MakeStringRequest(Servant servant, FutureResult<String> future, int count, char fillchar) {
		super(servant, future);
		this.count = count;
		this.fillchar = fillchar;
	}

	@Override
	public void execute() {
		Result<String> result = servant.makeString(count, fillchar);
		future.setResult(result);
	}
	
}
