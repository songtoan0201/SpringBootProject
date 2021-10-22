package com.infostretch.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.infostretch.IObjectVal;
import com.infostretch.IRangeVal;
import com.infostretch.ObjectVal;
import com.infostretch.RangeVal;

class ObjectValidator {

	@Test
	void Given1ReturnTrue() {
		//Given: I am a user
		//When: I enter the string "1"
		//Then: It will return integer 1
		IObjectVal Object = new ObjectVal();
		boolean result = Object.isInteger("1");
		assertEquals(result, true);
	}

	@Test
	void GivenFizzReturnFalse() {
		//Given: I am a user
		//When: I enter the string "1"
		//Then: It will return integer 1
		IObjectVal Object = new ObjectVal();
		boolean result = Object.isInteger("Fizz");
		assertEquals(result, false);
	}

}
