package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class CalculatorTest {
@Test
public void testAddition() {
	//Calculator cal= new Calculator();
	int r=Calculator.add(2, 3);
	System.out.println(" result " + r);
	assertEquals(5,r);
}
}
