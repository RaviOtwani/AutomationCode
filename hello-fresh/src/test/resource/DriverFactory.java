package test.resource;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class DriverFactory {
	private static Logger log = Logger.getLogger(DriverFactory.class);
	 
	public static WebDriver getDriver() {
        // Driver name from some config
        String driverName = "Chrome";
        WebDriver driver = null;
        log.info("Driver is " + driverName);
        if (driverName.contains("Chrome")) {
            try {
                driver = generateWebDriver(driverName);
            } catch (Exception e) {
                
            }
        } 
        return driver;
}

	private static WebDriver generateWebDriver(String driverName) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver_win32/chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20, 500);
		return driver;
	}
}
