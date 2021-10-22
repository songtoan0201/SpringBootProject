package com.infostretch.test;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.junit.Assert.*;


import org.junit.Test;

import com.infostretch.GetFizzBuzz;
import com.infostretch.IGetFizzBuzz;

public class Test1 {

	@Test
	public void givenOneGetOne() {
//		Given: I am a user
//		When: I enter the integer "1"
//		Then: I get back the string "1"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(1);
		assertEquals(result,"1");
	}

	@Test
	public void givenTwoGetTwo() {
//		Given: I am a user
//		When: I enter the integer "2"
//		Then: I get back the string "1,2"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(2);
		assertEquals(result,"1,2");
	}

	@Test
	public void given3Get12Fizz() {
//		Given: I am a user
//		When: I enter the string "3"
//		Then: I get back the string "1, 2, Fizz"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(3);
		assertEquals(result,"1,2,Fizz");
	}

	@Test
	public void given5Get12Fizz4Buzz() {
//		Given: I am a user
//		When: I enter the string "5"
//		Then: I get back the string "1, 2, Fizz, 4, Buzz"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(5);
		assertEquals(result,"1,2,Fizz,4,Buzz");
	}
	
	@Test
	public void given6GetStringEndInFizz() {
//		Given: I am a user
//		When: I enter the string "6"
//		Then: I get back a string ending in "Fizz"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(6);
		assertThat(result, endsWith("Fizz"));
	}
	
	@Test
	public void given10GetStringEndInBuzz() {
//		Given: I am a user
//		When: I enter the string "10"
//		Then: I get back a string ending in "Buzz"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(10);
		assertThat(result, endsWith("Buzz"));
	}
	
	@Test
	public void given15GetStringEndInFizzBuzz() {
//		Given: I am a user
//		When: I enter the string "15"
//		Then: I get back a string ending in "FizzBuzz"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(15);
		assertThat(result, endsWith("FizzBuzz"));
	}
	
	@Test
	public void given30GetStringEndInFizzBuzz() {
//		Given: I am a user
//		When: I enter the string "30"
//		Then: I get back a string ending in "FizzBuzz"
		IGetFizzBuzz IGFB = new GetFizzBuzz();
		String result = IGFB.getResult(30);
		assertThat(result, endsWith("FizzBuzz"));
	}
	
	
}
