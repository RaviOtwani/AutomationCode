package com.test.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.commonUtils.CommonDriverUtils;

public class LoginPage {
	public static By emailField = By.id("email");
    public static By passField = By.id("passwd");
    public static By submitButton = By.id("SubmitLogin");
    
    public static void enterEmail(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, emailField, text);
	}
    
    public static void enterPassword(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, passField, text);
	}
    
    public static void clickOnSignIn(WebDriver driver) {
		CommonDriverUtils.clickOnElement(driver, submitButton);
	}
}
