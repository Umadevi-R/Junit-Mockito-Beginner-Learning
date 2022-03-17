package com.testinginjava.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCalculator {
	
	Calculator calc = null;
	CalculatorService service = mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		calc = new Calculator(service);
	}
	
	@Test
	public void testAdd() {
		when(service.add(4, 5)).thenReturn(9);
		assertEquals(36, calc.perform(4, 5));
		verify(service.add(4, 5));
	}

}
