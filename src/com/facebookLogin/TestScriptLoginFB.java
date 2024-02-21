package com.facebookLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScriptLoginFB {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
		// Launch the Browser
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("1236798");
		
		driver.findElement(By.name("pass")).sendKeys("pps123");
		
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		
		

	}

}
