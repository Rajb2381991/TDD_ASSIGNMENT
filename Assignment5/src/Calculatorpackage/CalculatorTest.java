package Calculatorpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testAddition() 
	{
		assertEquals(10, Calculator.add(11, -1));
		assertEquals(10, Calculator.add(0, 10));
		assertEquals(10, Calculator.add(8, 2));
		assertEquals(10, Calculator.add(5, 5));
		assertEquals(10, Calculator.add(2, 8));
		assertEquals(10, Calculator.add(8, 2));
		assertEquals(10, Calculator.add(6, 4));
		assertEquals(10, Calculator.add(7, 3));
	}
	@Test
	public void testSubtraction() 
	{
		assertEquals(10, Calculator.subtract(11, 1));
		assertEquals(10, Calculator.subtract(10, 0));
		assertEquals(16, Calculator.subtract(18, 2));
		assertEquals(0, Calculator.subtract(5, 5));
		assertEquals(-6, Calculator.subtract(2, 8));
		assertEquals(6, Calculator.subtract(8, 2));
		assertEquals(2, Calculator.subtract(6, 4));
		assertEquals(4, Calculator.subtract(7, 3));
	}
	@Test
	public void testMultiplication() 
	{
		assertEquals(1, Calculator.multiply(1, 1));
		assertEquals(10, Calculator.multiply(1, 10));
		assertEquals(16, Calculator.multiply(16, 1));
		assertEquals(16, Calculator.multiply(4, 4));
		assertEquals(16, Calculator.multiply(2, 8));
		assertEquals(16, Calculator.multiply(8, 2));
		assertEquals(24, Calculator.multiply(6, 4));
		assertEquals(21, Calculator.multiply(7, 3));
	}
	@Test
	public void testDevision()
	{
		assertEquals(3, Calculator.divide(21,7));
		assertEquals(7, Calculator.divide(21,3));
		assertEquals(21, Calculator.divide(21,1));
		assertEquals(3, Calculator.divide(12,4));
		assertEquals(7, Calculator.divide(49,7));
		assertEquals(13, Calculator.divide(52,4));
		assertEquals(-3, Calculator.divide(-21,7));
		assertEquals(1, Calculator.divide(1,1));
		
	}
}
