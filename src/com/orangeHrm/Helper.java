package com.orangeHrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		// Set Properties with key and values of driver .
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
        // Launch the Browser
	     driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
