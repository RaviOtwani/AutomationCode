package com.test.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.commonUtils.CommonDriverUtils;

public class CheckoutPage {
	public static By category = By.linkText("Women");
    public static By subCategory = By.xpath("//a[@title='Faded Short Sleeve T-shirts']/ancestor::li");
    public static By addToCart = By.xpath("//a[@title='Faded Short Sleeve T-shirts']/ancestor::li//span[contains(text(),'Add to cart')]");
    public static By checkoutButton = By.xpath("//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']");
    public static By processCheckoutButton = By.xpath("//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']");
    public static By processAddress = By.name("processAddress");
    public static By uniform = By.id("uniform-cgv");
    public static By bankWire = By.className("bankwire");
    public static By cartNavigation = By.xpath("//*[@id='cart_navigation']/button");
    public static By processCarrier = By.name("processCarrier");
    public static By lastFour = By.xpath("//li[@class='step_done step_done_last four']");
    public static By currentLast = By.xpath("//li[@id='step_end' and @class='step_current last']");
    
    public static void clickOnCategory(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, category);
    }
    
    public static void clickOnSubCategory(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, subCategory);
    }
    
    public static void clickOnAddcart(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, addToCart);
    }
    
    public static void clickOnCheckOut(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, checkoutButton);
    }
    
    public static void clickOnProcessCheckOut(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, processCheckoutButton);
    }
    public static void clickOnProcessAddress(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, processAddress);
    }
    
    public static void clickOnUniform(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, uniform);
    }
    
    public static void clickOnBank(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, bankWire);
    }
    
    public static void clickOnCartNav(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, cartNavigation);
    }
    public static void clickOnProcessCar(WebDriver driver) {
    	CommonDriverUtils.clickOnElement(driver, processCarrier);
    }
}
