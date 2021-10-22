package com.infostretch.test;

import org.junit.jupiter.api.Test;


import com.infostretch.IGetFizzBuzz;
import com.infostretch.IObjectVal;
import com.infostretch.IRangeVal;
import com.infostretch.mock.Flow;
import com.infostretch.mock.IFlowTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.Silent.class) 
class Test1Flow {

	//@InjectMocks
//    ShotFlow shotFlow;
    @Mock
    //IObjectVal mockConvertString;
    IObjectVal mockConvertString = mock(IObjectVal.class);
    @Mock
    IRangeVal mockRangeVal = mock(IRangeVal.class);
    @Mock
    IGetFizzBuzz mockGetFizzBuzz = mock(IGetFizzBuzz.class);
    
	@Test
	void Given1CallObjectValidator() {
//		Given: I am a user
//		When: I enter the number 1
//		Then: ConvertString.getresult will be called 1 time
		given(mockConvertString.isInteger("1")).willReturn(true);
		given(mockRangeVal.getResult(1)).willReturn(true);
		given(mockGetFizzBuzz.getResult(1)).willReturn("1");
		
		IFlowTest ICSF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		ICSF.getResult("1");
		verify(mockConvertString, times(1)).isInteger("1");
	}
	
	@Test
	void Given1CallRangeValidator() {
//		Given: I am a user
//		When: I enter the number 1
//		Then: RangeVal.getresult will be called 1 time
		given(mockConvertString.isInteger("1")).willReturn(true);
		given(mockRangeVal.getResult(1)).willReturn(true);
		given(mockGetFizzBuzz.getResult(1)).willReturn("1");
		
		IFlowTest IRVF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		IRVF.getResult("1");
		verify(mockRangeVal, times(1)).getResult(1);
	}
	
	@Test
	void Given1CallGetFizzBuzz() {
//		Given: I am a user
//		When: I enter the number 1
//		Then: GetFizzBuzz.getresult will be called 1 time
		given(mockConvertString.isInteger("1")).willReturn(true);
		given(mockRangeVal.getResult(1)).willReturn(true);
		given(mockGetFizzBuzz.getResult(1)).willReturn("1");
		
		IFlowTest IGFBF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		IGFBF.getResult("1");
		verify(mockGetFizzBuzz, times(1)).getResult(1);
	}

	@Test
	void Given0CallObjectValidator1Time() {
//		Given: I am a user
//		When: I enter the number 0
//		Then: ConvertString.getresult will be called 1 time
		given(mockConvertString.isInteger("0")).willReturn(true);
		given(mockRangeVal.getResult(0)).willReturn(false);
		given(mockGetFizzBuzz.getResult(0)).willReturn("0");
		
		IFlowTest ICSF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		ICSF.getResult("0");
		verify(mockConvertString, times(1)).isInteger("0");
	}
	
	@Test
	void Given0CallRangeValidator1Time() {
//		Given: I am a user
//		When: I enter the number 0
//		Then: RangeVal.getresult will be called 1 time
		given(mockConvertString.isInteger("0")).willReturn(true);
		given(mockRangeVal.getResult(0)).willReturn(false);
		given(mockGetFizzBuzz.getResult(0)).willReturn("0");
		
		IFlowTest IRVF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		IRVF.getResult("0");
		verify(mockRangeVal, times(1)).getResult(0);
	}
	
	@Test
	void Given0CallGetFizzBuzz0Time() {
//		Given: I am a user
//		When: I enter the number 0
//		Then: GetFizzBuzz.getresult will be called 0 time
		given(mockConvertString.isInteger("0")).willReturn(true);
		given(mockRangeVal.getResult(0)).willReturn(false);
		given(mockGetFizzBuzz.getResult(0)).willReturn("0");
		
		IFlowTest IGFBF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		IGFBF.getResult("0");
		verify(mockGetFizzBuzz, times(0)).getResult(0);
	}
	
	@Test
	void GivenFiveCallObjectValidator1Time() {
//		Given: I am a user
//		When: I enter the string "five"
//		Then: ConvertString.getresult will be called 1 time
		given(mockConvertString.isInteger("five")).willReturn(false);
		given(mockRangeVal.getResult(0)).willReturn(false); // change to isANY()
		given(mockGetFizzBuzz.getResult(0)).willReturn("0");
		
		IFlowTest ICSF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		ICSF.getResult("five");
		verify(mockConvertString, times(1)).isInteger("five");
	}
	
	@Test
	void GivenFiveCallRangeValidator0Time() {
//		Given: I am a user
//		When: I enter the string "five"
//		Then: RangeVal.getresult will be called 1 time
		given(mockConvertString.isInteger("five")).willReturn(false);
		given(mockRangeVal.getResult(0)).willReturn(false); // change to isANY()
		given(mockGetFizzBuzz.getResult(0)).willReturn("0");
		
		IFlowTest IRVF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		IRVF.getResult("0");
		verify(mockRangeVal, times(0)).getResult(0);
	}
	
	@Test
	void GivenFiveCallGetFizzBuzz0Time() {
//		Given: I am a user
//		When: I enter the string "five"
//		Then: GetFizzBuzz.getresult will be called 1 time
		given(mockConvertString.isInteger("five")).willReturn(false);
		given(mockRangeVal.getResult(0)).willReturn(false); // change to isANY()
		given(mockGetFizzBuzz.getResult(0)).willReturn("0");
		
		IFlowTest IGFBF = new Flow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
		IGFBF.getResult("0");
		verify(mockGetFizzBuzz, times(0)).getResult(0);
	}
	
}
