package edu.cmu.cs.cs214.hw2.operator;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * Class to test the class UnaryOperatorImp
 * @author zhilinh
 *
 */
public class UnaryOperatorTest {

	/**
	 * Test for toString method and apply method of ABS.
	 */
	@Test
	public void testABS() {
		double arg1 = -1.0;
		double arg2 = 1.0;
		double arg3 = 0.0;
		UnaryOperator absOperator = UnaryOperatorImp.ABS;
		assertEquals(absOperator.toString(), "abs");
		assertEquals(BigDecimal.valueOf(absOperator.apply(arg1)), BigDecimal.valueOf(arg2));
		assertEquals(BigDecimal.valueOf(absOperator.apply(arg2)), BigDecimal.valueOf(arg2));
		assertEquals(BigDecimal.valueOf(absOperator.apply(arg3)), BigDecimal.valueOf(arg3));
	}
	
	/**
	 * Test for toString method and apply method of NEGATION.
	 */
	@Test
	public void testNegation() {
		double arg1 = 1.0;
		double arg2 = -1.0;
		double arg3 = 0.0;
		UnaryOperator negationOperator = UnaryOperatorImp.NEGATION;
		assertEquals(negationOperator.toString(), "��");
		assertEquals(BigDecimal.valueOf(negationOperator.apply(arg1)), BigDecimal.valueOf(arg2));
		assertEquals(BigDecimal.valueOf(negationOperator.apply(arg3)), BigDecimal.valueOf(arg3));
	}
	
}
