package com.facebookLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript2 {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
		// Launch the Browser
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayDropdown=driver.findElement(By.id("day"));
		
		Select s=new Select(dayDropdown);
		
		List<WebElement> allDays=s.getOptions();
		
		//System.out.println(allDays.size());
		
		for(int i=0; i<allDays.size(); i++) {
			 
			if(i==10) {
				break;
			}
			System.out.println(allDays.get(i).getText());
		}

	}

}
