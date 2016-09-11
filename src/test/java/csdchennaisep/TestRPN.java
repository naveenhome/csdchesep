package csdchennaisep;

import junit.framework.TestCase;

public class TestRPN extends TestCase{
	
	public void testRPN1()
	{
		String expr = "2,3,+";
		RPN rpn = new RPN();
		assertEquals(5, rpn.calc(expr));
	}
	public void testRPN2()
	{
		String expr = "2,5,+";
		RPN rpn = new RPN();
		assertEquals(7, rpn.calc(expr));
	}
	public void testRPN3()
	{
		String expr = "2,5,+,5,+";
		RPN rpn = new RPN();
		assertEquals(12, rpn.calc(expr));
	}

}
