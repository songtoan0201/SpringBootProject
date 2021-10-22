package com.infostretch.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.infostretch.IRangeVal;
import com.infostretch.RangeVal;

class RangeValidator {

	@Test
	void Given0GetFalse() {
		//Given: I am a user
		//When: I enter the string "0"
		//Then: It will return false
		IRangeVal Range = new RangeVal();
		boolean result = Range.getResult(0);
		assertEquals(result, false);
	}

	@Test
	void Given1GetTrue() {
		//Given: I am a user
		//When: I enter the string "1"
		//Then: It will return True
		IRangeVal Range = new RangeVal();
		boolean result = Range.getResult(1);
		assertEquals(result, true);
	}
	
    @Test
    public void Given300GetTrue() {
        //Given: I am a user
        //When: I enter the integer 300
        IRangeVal Range = new RangeVal();
        boolean result = Range.getResult(300);
        //Then: I get back true
        assertEquals(true, result);
    }


    @Test
    public void Given400GetFalse() {
        //Given: I am a user
        //When: I enter the integer 400
        IRangeVal Range = new RangeVal();
        boolean result = Range.getResult(400);
        //Then: I get back false
        assertEquals(false, result);
    }
}
