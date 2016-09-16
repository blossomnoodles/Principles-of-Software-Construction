package edu.cmu.cs.cs214.hw2.expression;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {
	
	private Expression productTest;
	private double number1 = 1.0;
	private double number2 = 2.0;
	private double number3 = 2.0;
	private Expression addend1 = new NumberExpression(number1);
	private Expression addend2 = new NumberExpression(number2);
	
	@Before
	public void setup() {
		productTest = new ProductExpression(addend1, addend2);
	}
	
	@Test
	public void testtoString() {
		assertEquals("(" + addend1.toString() + "*" + addend2.toString() + ")", productTest.toString());
	}
	
	@Test
	public void testEval() {
		assertEquals(BigDecimal.valueOf(number3), BigDecimal.valueOf(productTest.eval()));
	}

}