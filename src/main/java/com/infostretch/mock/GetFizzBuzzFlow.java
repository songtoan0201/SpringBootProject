package com.infostretch.mock;

import com.infostretch.IGetFizzBuzz;

public class GetFizzBuzzFlow implements IGetFizzBuzzFlow {
	private IGetFizzBuzz _IGFB;
	
	public GetFizzBuzzFlow(IGetFizzBuzz IGFB) {
		_IGFB = IGFB;
	}
	public String getResult(int num) {
		_IGFB.getResult(num);
		return "";
	}
}
