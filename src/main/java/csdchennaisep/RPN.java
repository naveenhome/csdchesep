package csdchennaisep;

import java.util.Stack;

public class RPN {

	public int calc(String expr)
	{
		String []input = expr.split(",");
		Stack<String> myStack = new Stack<String>();
		for(int i=0;i<input.length;i++)
		{
			if(input[i].equals("+"))
			{
				int secondVal = Integer.parseInt(myStack.pop());
				int firstVal = Integer.parseInt(myStack.pop());
				myStack.push(String.valueOf((firstVal+secondVal)));		
			}
			else if(input[i].equals("-"))
			{
				int secondVal = Integer.parseInt(myStack.pop());
				int firstVal = Integer.parseInt(myStack.pop());
				myStack.push(String.valueOf((firstVal-secondVal)));		
			}
			else
			{
				myStack.push(input[i]);
			}
		}
		
		return Integer.parseInt(myStack.pop());
	}
}
