package com.lti.training.devops.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lti.training.devops.junit.Calculator;

public class CalculatorTest {
	
	
		private Calculator c;
	
	@Before
	public void init(){
	 c= new Calculator();
	}
	
	@Test
	public void testIfAddmethodisAddingOrNot() {
		
		int actualResult= c.add(10, 20);
		int expectedResult= 30;
		assertEquals(expectedResult,actualResult);
	}
	

	@Test
	public void testIfSubmethodisSubtractingOrNot() {
		
		int actualResult= c.sub(10, 20);
		int expectedResult= -10;
		assertEquals(expectedResult,actualResult);
	}
  
}

