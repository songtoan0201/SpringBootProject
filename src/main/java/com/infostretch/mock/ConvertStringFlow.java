package com.infostretch.mock;

import com.infostretch.IObjectVal;

public class ConvertStringFlow implements IConvertStringFlow {
	private IObjectVal _ICS;
	
	public ConvertStringFlow(IObjectVal ICS) {
		_ICS = ICS;
	}
	public String getResult(String s) {
		_ICS.isInteger(s);
		return "";
	}
}
