package csdchennaisep;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	
	public void testLargestCase1() throws Exception
	{
		int []arr={4,5,2,8,6,9,5};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testLargestCase2() throws Exception
	{
		int []arr={4,5,2,8,6,5};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
	}
	public void testLargestCase3() throws Exception
	{
		int []arr={-4,-5,-2,-8,-6,-5};
		Largest obj = new Largest();
		assertEquals(-2, obj.find(arr));
	}
	public void testLargestCase4()
	{
		int []arr={};
		try{
		Largest obj = new Largest();
		assertEquals(null, obj.find(arr));
		}catch(Exception ex)
		{
			assertEquals("Array is empty", ex.getMessage());
		}
	}
	public void testLargestCase6() throws Exception
	{
		int []arr={4,5,2,6,5};
		Largest obj = new Largest();
		assertEquals(5, obj.find(arr));
	}


}
