package org.testing.validation;

import org.testing.assertion.Assertion1;

import io.restassured.response.Response;

public class ValidationStatus {
	
	public static boolean status(Response res, int expected )
	{
		int actual = res.statusCode();
		boolean result = Assertion1.assert1(expected, actual);
		return result;
	}

}
