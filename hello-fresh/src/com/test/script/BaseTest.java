package com.test.script;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import test.resource.DriverFactory;

public class BaseTest {
	
    String existingUserEmail = "hf_challenge_123456@hf123456.com";
    String existingUserPassword = "12345678";
    WebDriver driver = null;
    
    @BeforeMethod
    public void setUp() {
       
    	driver = DriverFactory.getDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
	
    @SuppressWarnings("resource")
	@AfterMethod 
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location 
				File target = new File(System.getProperty("user.dir")+"/src/test/resource/Failure"+ new Random(15).nextInt()+".png");
			
	
				Files.copy(src, target);
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}
	driver.quit();
	}
}
