package com.e2etests.automation.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Setup {

 

    private static WebDriver driver;

 

    /**
     * This method is used to open browser. This method is called before the
     * invocation of each test method in the given class. In this method we need to
     * pass browser name which will invoke the respective driver.
     * 
     * @throws MalformedURLException the malformed URL exception
     * @Before Methods annotated with @Before will execute before every scenario.
     */

 

    @Before // Hooks Of Cucumber
    public void setWebDriver() throws MalformedURLException {
        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "firefox";
        }
        switch (browser) {
        case "chrome":
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.setPlatformName("Windows 10");
    	chromeOptions.setBrowserVersion("latest");
    	Map<String, Object> sauceOptions = new HashMap<>();
    	sauceOptions.put("username", "oauth-tghada0211-97f6f");
    	sauceOptions.put("accessKey", "dbebd896-473a-4292-8391-4b68eae08e77");
    	sauceOptions.put("build", "selenium-build-AP677");
    	sauceOptions.put("name", "MigrationCucumber");
    	chromeOptions.setCapability("sauce:options", sauceOptions);

    	URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
    	driver = new RemoteWebDriver(url, chromeOptions);
    	break;

    	 
        case "firefox":
        	System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win/geckodriver.exe");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setCapability("platformName", "Windows 10");
            firefoxOptions.setCapability("browserVersion", "latest");
            Map<String, Object> firefoxSauceOptions = new HashMap<>();
            firefoxSauceOptions.put("username", "oauth-tghada0211-97f6f");
            firefoxSauceOptions.put("accessKey", "dbebd896-473a-4292-8391-4b68eae08e77");
            firefoxSauceOptions.put("build", "selenium-build-AP677");
            firefoxSauceOptions.put("name", "MigrationCucumber");
            firefoxOptions.setCapability("sauce:options", firefoxSauceOptions);
          URL firefoxUrl = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
            driver = new RemoteWebDriver(firefoxUrl, firefoxOptions);
            break;
        }
    }
    /* Getter */
    public static WebDriver getDriver() {
        return driver;
    }
}