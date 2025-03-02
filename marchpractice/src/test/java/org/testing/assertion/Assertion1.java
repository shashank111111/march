package org.testing.assertion;

public class Assertion1 {
	
	public static boolean assert1(int expected, int actual)
	{
		if(expected==actual)
		{
			System.out.println("status code is matching");
			return true;
		}
		else
		{
			System.out.println("status code is matching");
			return false;	
		}
		
	}

}
