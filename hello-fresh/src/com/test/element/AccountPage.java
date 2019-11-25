package com.test.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.test.commonUtils.CommonDriverUtils;

/* 
 * AccountPage
 * Elements related to Account page and its method 
 * 
 * 
 * */
public class AccountPage {
	
	public static By emailField = By.id("email_create");
	public static By submitButton = By.id("SubmitCreate");
	public static By gender = By.id("id_gender2");
	public static By firstName = By.id("customer_firstname");
	public static By lastName = By.id("customer_lastname");
	public static By password = By.id("passwd");
	public static By company = By.id("company");
	public static By address1 = By.id("address1");
	public static By address2 = By.id("address2");
	public static By city = By.id("city");
	public static By state =  By.id("id_state");
	public static By postcode = By.id("postcode");
	public static By phone = By.id("phone");
	public static By phone_mobile = By.id("phone_mobile");
	public static By alias = By.id("alias");
	public static By createAccount = By.id("submitAccount");
	public static By days = By.id("days");
	public static By months = By.id("months");
	public static By years = By.id("years");
			
	public static void enterEmail(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, emailField, text);
	}
	
	public static void clickOnSubmit(WebDriver driver) {
		CommonDriverUtils.clickOnElement(driver, submitButton);
	}
	
	public static void clickOnCreateAccount(WebDriver driver) {
		CommonDriverUtils.clickOnElement(driver, createAccount);
	}
	
	public static void clickOnGenderId(WebDriver driver) {
		CommonDriverUtils.clickOnElement(driver, gender);
	}
	
	public static void enterCompany(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, company, text);
	}
	
	public static void enterAddress1(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, address1, text);
	}
	
	public static void enterAddress2(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, address2, text);
	}
	
	public static void enterCity(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, city, text);
	}
	
	public static void enterPostCode(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, postcode, text);
	}
	
	public static void enterPhone(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, phone, text);
	}
	
	public static void enterMobile(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, phone_mobile, text);
	}
	
	public static void enterAlias(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, alias, text);
	}
	
	public static void enterFirstName(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, firstName, text);
	}
	
	public static void enterLastName(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, lastName, text);
	}

	public static void enterPassword(WebDriver driver, String text) {
		CommonDriverUtils.enterText(driver, password, text);
	}
	public static void selectState(WebDriver driver, String text) {
		Select select = new Select(driver.findElement(state));
	    select.selectByVisibleText(text);
	}
	
	public static void selectBirth(WebDriver driver, String day, String month, String year) {
		Select select = new Select(driver.findElement(days));
        select.selectByValue(day);
        select = new Select(driver.findElement(months));
        select.selectByValue(month);
        select = new Select(driver.findElement(years));
        select.selectByValue(year);
	}
}
