package com.test.commonUtils;

import static org.testng.Assert.assertTrue;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/* 
 * CommonDriverUtils
 * Above class file contains all the methods used 
 * by driver for performing any action or 
 * verifications.
 * 
 * */

public class CommonDriverUtils {

	public static WebElement waitUntilVisible(WebDriver driver, By id) {
		// Verify visibility of element for 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, 15, 50);
		WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver t) {
				return t.findElement(id);
			}
		});
		return webElement;
	}
	
	public static void clickOnElement(WebDriver driver, By id) {
		// Click on a specific element.
		WebElement webElement =  waitUntilVisible(driver, id);
		WebDriverWait wait = new WebDriverWait(driver, 15, 50);
		wait.until(ExpectedConditions.elementToBeClickable(id));
		webElement.click();
	}

	public static void verifyElementIsDisplayed(WebDriver driver, By xpath) {
		// Verify that element is displayed on UI.
		assertTrue(driver.findElement(xpath).isDisplayed());
	}

	public static void enterText(WebDriver driver, By id, String existingUserEmail) {
		// Enter text to a specific element.
		driver.findElement(id).sendKeys(existingUserEmail);
	}

	

	
}
