package com.test.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.test.commonUtils.CommonDriverUtils;

/* 
 * HomePage
 * Elements related to Home page and its method 
 * 
 * 
 * */

public class HomePage {
	
	public static By signInLink = By.className("login");
	public static By logout = By.className("logout");
	
	
	public static void openSignInPage(WebDriver driver) {
		CommonDriverUtils.clickOnElement(driver, signInLink);
	}
}
