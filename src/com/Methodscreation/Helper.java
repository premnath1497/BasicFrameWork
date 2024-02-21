package com.Methodscreation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {
	
	public static WebDriver driver;
	
	public static void LaunchBrowser(String url) {
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
        // Launch the Browser
	     driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public static String verificationOfTitle(String expectedTilte) {
		
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTilte)) 
			
			{
				   System.out.println("Test Case Passed");
				   
			   }
			   else {
				   System.out.println("Test Case Failed");
			   }
		
        
		return actualTitle;
	}

	public static void enterUserName(String xpathUserName,String userName) {
		  WebElement username=driver.findElement(By.xpath(xpathUserName));
		   username.sendKeys(userName);
	}
	
	public static void enterPassword(String xpathPassword,String password) {
		  WebElement passwords=driver.findElement(By.xpath(xpathPassword));
		   passwords.sendKeys(password);
	}

	public static void ClickonLogin(String xpathlogin) {
		
		 driver.findElement(By.xpath(xpathlogin)).click();
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}
