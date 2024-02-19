package com.orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Helper {

	public static void login(String url,String xpathUsername,String user,
			String xpathPassword,String password,String xpathLogin) {
		 // Hit the URL in Browser
		   driver.get(url);
	       // Enter Username 
		   WebElement username=driver.findElement(By.xpath(xpathUsername));
		   username.sendKeys(user);
		   //
		   driver.findElement(By.xpath(xpathPassword)).sendKeys(password);
		   
		   driver.findElement(By.xpath(xpathLogin)).click();
	}
}
