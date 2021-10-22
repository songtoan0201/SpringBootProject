package com.infostretch.mock;

import com.infostretch.IRangeVal;

public class RangeValidatorFlow implements IRangeValidatorFlow {
	private IRangeVal _IRV;
	
	public RangeValidatorFlow(IRangeVal IRV) {
		_IRV = IRV;
	}
	public String getResult(int num) {
		_IRV.getResult(num);
		return "";
	}
}
