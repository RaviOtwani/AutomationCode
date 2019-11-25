package com.test.api;

import java.util.Random;

import org.testng.Assert;

public class ApiTest {

	static String data1 = "{\r\n" + 
			"  \"bookingdates\": {\r\n" + 
			"    \"checkin\": \"2019-11-11\",\r\n" + 
			"    \"checkout\": \"2019-11-13\"\r\n" + 
			"  },\r\n" + 
			"  \"depositpaid\": true,\r\n" + 
			"  \"email\": \"r@yahoo.com\",\r\n" + 
			"  \"firstname\": \"abc\",\r\n" + 
			"  \"lastname\": \"abc\",\r\n" + 
			"  \"phone\": \"12345678909\",\r\n" + 
			"  \"roomid\": {id}\r\n" + 
			"}";
	
	static String data2 = "{\r\n" + 
			"  \"bookingdates\": {\r\n" + 
			"    \"checkin\": \"2019-11-10\",\r\n" + 
			"    \"checkout\": \"2019-11-11\"\r\n" + 
			"  },\r\n" + 
			"  \"depositpaid\": true,\r\n" + 
			"  \"email\": \"r@yahoo.com\",\r\n" + 
			"  \"firstname\": \"abc\",\r\n" + 
			"  \"lastname\": \"abc\",\r\n" + 
			"  \"phone\": \"12345678909\",\r\n" + 
			"  \"roomid\": {id}\r\n" + 
			"}";
	
	
	public static void main(String[] args) {
		String roomId1 = String.valueOf(new Random().nextInt(1000));
		String roomId2 = String.valueOf(new Random().nextInt(1000));
		
		data1 = data1.replace("{id}", roomId1);
		data2 = data2.replace("{id}", roomId2);
		String response = JavaClient.executeAPICall("https://automationintesting.online/booking/", "POST", data1, 201);
		String bookingId1  = response.split("\"bookingid\":")[1].split(",")[0];
		response = JavaClient.executeAPICall("https://automationintesting.online/booking/", "POST", data2, 201);
		JavaClient.executeAPICall("https://automationintesting.online/booking/", "POST", data2, 409);
		response = JavaClient.executeAPICall("https://automationintesting.online/booking/", "GET", "", 200);
		Assert.assertTrue(response.trim().contains("\"roomid\":"+roomId1));
		Assert.assertTrue(response.trim().contains("\"roomid\":"+roomId2));
		
		response = JavaClient.executeAPICall("https://automationintesting.online/booking/"+bookingId1, "GET", "", 200);
	}

}
