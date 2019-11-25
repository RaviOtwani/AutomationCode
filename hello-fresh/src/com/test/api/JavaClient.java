package com.test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaClient {

	
	public static String executeAPICall(String endpoint, String method,String data, int responseCode) {
		String response = "";
	  try {
		  
		URL url = new URL(endpoint);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod(method);
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("accept", " */*");
		conn.setRequestProperty("User-Agent", "HTTP 1.0");
		String input = "";
		if(data != null && data != "") {
			conn.setDoOutput(true);
			input = data;
			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
		}
		

		if (conn.getResponseCode() != responseCode) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			response += output;
			System.out.println(output);
		}

		conn.disconnect();
	
	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }
	  return response;

	}

}