package com.infostretch;

public class RangeVal implements IRangeVal {

	@Override
	public boolean getResult(int num) {
		if(num >= 1 && num <= 300) return true;
		return false;
	}

}
