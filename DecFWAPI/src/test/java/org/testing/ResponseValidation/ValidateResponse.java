package org.testing.ResponseValidation;

import org.testing.assertion.Assertion1;

import io.restassured.response.Response;

public class ValidateResponse {
	
	
	public static boolean status(Response res, int Expectedstatuscode )
	
	{
		int Actualstatuscode = res.getStatusCode();
		boolean result = Assertion1.assertt(Expectedstatuscode, Actualstatuscode);
		return result;
		
		
	}

}
