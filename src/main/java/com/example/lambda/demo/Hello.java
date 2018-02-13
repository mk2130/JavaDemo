package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<String, String> {

	@Override
	public String handleRequest(String input, Context context) {
<<<<<<< HEAD
	  context.getLogger().log("Input: " + input);
	  String output = "Hello, " + input + "!";
=======
	  String output = "Hello mayur !";
>>>>>>> 3bd5fbf2171250de7f812e1e2ac35196069d6116
	  return output;
	}

}
