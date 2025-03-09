package org.testing.assertion;

import org.testng.Assert;

public class Assertion1 {
	
	public static boolean assertt(int expected, int actual)
	{
		if(actual==expected)
		{
			System.out.println("Status code is amtching ");
			return true;
		}
		
		else
		{
			System.out.println("Status code is not matching ");
			return false;
		}
		
		
		
	}

}
