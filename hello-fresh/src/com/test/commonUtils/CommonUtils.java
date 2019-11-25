package com.test.commonUtils;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.element.AccountPage;
import com.test.element.CheckoutPage;
import com.test.element.LoginPage;

public class CommonUtils {

	public static void createAccount(WebDriver driver, String email, String name, String surname) {
		// Common Utils to create an Account
		AccountPage.enterEmail(driver, email);
        AccountPage.clickOnSubmit(driver);
        AccountPage.clickOnGenderId(driver);
        AccountPage.enterFirstName(driver, name);
        AccountPage.enterLastName(driver, surname);
        AccountPage.enterPassword(driver, "Qwerty");
        AccountPage.selectBirth(driver, "1", "1", "2000");
        AccountPage.enterCompany(driver, "Company");
        AccountPage.enterAddress1(driver, "Qwerty, 123");
        AccountPage.enterAddress2(driver, "zxcvb");
        AccountPage.enterCity(driver, "Qwerty");
        AccountPage.enterPostCode(driver, "12345");
        AccountPage.enterPhone(driver, "12345123123");
        AccountPage.enterMobile(driver, "12345123123");
        AccountPage.enterAlias(driver, "hf");
        AccountPage.selectState(driver, "Colorado");
        AccountPage.clickOnCreateAccount(driver);
        
        WebElement heading = CommonDriverUtils.waitUntilVisible(driver, By.cssSelector("h1")); 
        
        assertEquals(heading.getText(), "MY ACCOUNT");
	}
	public static void login(WebDriver driver, String username, String password) {
		LoginPage.enterEmail(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.clickOnSignIn(driver);
	}
	
	public static void checkOut(WebDriver driver) {
		 CheckoutPage.clickOnCategory(driver);
	        CheckoutPage.clickOnSubCategory(driver);
	        CheckoutPage.clickOnAddcart(driver);
	        CheckoutPage.clickOnCheckOut(driver);
	        CheckoutPage.clickOnProcessCheckOut(driver);
	        CheckoutPage.clickOnProcessAddress(driver);
	        CheckoutPage.clickOnUniform(driver);
	        CheckoutPage.clickOnProcessCar(driver);
	        CheckoutPage.clickOnBank(driver);
	        CheckoutPage.clickOnCartNav(driver);
		
	}
}
