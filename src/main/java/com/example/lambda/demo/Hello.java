package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<String, String> {

	@Override
	public String handleRequest(String input,String input1) {
	  String output = "Hello, " + input + "!";
	  return output;
	}

}
