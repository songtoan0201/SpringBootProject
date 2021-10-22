package com.infostretch;

public class GetFizzBuzz implements IGetFizzBuzz{
	public String getResult(int num) {
//		if(num == 2) return "1,2";
//		if(num == 3) return "1,2,Fizz";
//		if(num == 5) return "1,2,Fizz,4,Buzz";
//		if(num == 6) return "1,2,Fizz,4,Buzz,Fizz";
//		if(num == 10) return "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz";
//		return "1";
		String res = "1";
		for(int i = 2; i <= num; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				res += ",FizzBuzz";
			} else if(i % 3 == 0) {
				res += ",Fizz";
			} else if(i % 5 == 0) {
				res += ",Buzz";
			} else {
				res += "," + String.valueOf(i);
			}
		}
		return res;
	}
}
