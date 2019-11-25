package com.test.script;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.test.commonUtils.CommonDriverUtils;
import com.test.commonUtils.CommonUtils;
import com.test.element.HomePage;

public class CreateAccountTest extends BaseTest{
	
	 
	 @Test
	    public void logInTest() {
	        String fullName = "Joe Black";
	        HomePage.openSignInPage(driver);
	        CommonUtils.login(driver, existingUserEmail, existingUserPassword);
	        
	        WebElement heading = CommonDriverUtils.waitUntilVisible(driver, By.cssSelector("h1"));

	        assertEquals("MY ACCOUNT", heading.getText());
	        assertEquals(fullName, driver.findElement(By.className("account")).getText());
	        assertTrue(driver.findElement(By.className("info-account")).getText().contains("Welcome to your account."));
	        assertTrue(driver.findElement(HomePage.logout).isDisplayed());
	        assertTrue(driver.getCurrentUrl().contains("controller=my-account"));
	    }
 
}
