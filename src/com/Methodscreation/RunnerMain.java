package com.Methodscreation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunnerMain {
	

	public static void main(String[] args) {
		
		Helper.LaunchBrowser(TestData.faceBookUrL);
		Helper.enterUserName(Elements.xpathFacebookUsername, TestData.fusername);
		Helper.enterPassword(Elements.xpathFacebookPassword, TestData.fpassword);
		Helper.ClickonLogin(Elements.xpathFacebooklogin);
		Helper.verificationOfTitle(TestData.expectedTitle);
		Helper.closeBrowser();
		
           

	}

}
