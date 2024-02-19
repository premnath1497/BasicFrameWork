package com.orangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basic extends Helper {

	
	
	
	

	public static void main(String[] args) {
	
		Helper.launchBrowser();
		Login.login(TestData.orangeHrmUrl,Elements.xpathUsername,TestData.userName,
				Elements.xpathPassword,TestData.password,Elements.xpathLogin);
		Verification.verification();
	}

}
