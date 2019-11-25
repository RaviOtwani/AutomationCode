package com.test.script;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.test.commonUtils.CommonDriverUtils;
import com.test.commonUtils.CommonUtils;
import com.test.element.CheckoutPage;
import com.test.element.HomePage;

public class CheckOut extends BaseTest{
	    @Test
	    public void checkoutTest() {
	    	HomePage.openSignInPage(driver);
	        CommonUtils.login(driver, existingUserEmail, existingUserPassword);
	        
	        CommonUtils.checkOut(driver);
	       
	        WebElement heading = CommonDriverUtils.waitUntilVisible(driver, By.cssSelector("h1"));
	        assertEquals("ORDER CONFIRMATION", heading.getText());
	        CommonDriverUtils.verifyElementIsDisplayed(driver , CheckoutPage.lastFour);
	        CommonDriverUtils.verifyElementIsDisplayed(driver , CheckoutPage.currentLast);
	        
	        assertTrue(driver.findElement(By.xpath("//*[@class='cheque-indent']/strong")).getText().contains("Your order on My Store is complete."));
	        assertTrue(driver.getCurrentUrl().contains("controller=order-confirmation"));
	    }
 

}
