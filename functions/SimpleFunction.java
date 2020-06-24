package com.example.functions;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class SimpleFunction implements HttpFunction {

	@Override
	public void service(HttpRequest request, HttpResponse response) throws Exception {
		BufferedReader reader = request.getReader();
		String input = reader.readLine();
		BufferedWriter writer = response.getWriter();
		writer.write(input);
	}

}
