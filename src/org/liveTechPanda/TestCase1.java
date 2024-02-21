package org.liveTechPanda;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\1\\Desktop\\API Jar\\geckodriver.exe");
		// Launch the Browser
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://live.techpanda.org/index.php/");

		String actualTileofHomePage = driver.getTitle();

		String expectedTitleOfHomePage = "Home page";

		if (actualTileofHomePage.equals(expectedTitleOfHomePage)) {

			System.out.println("Test Case Of HomePage Title Verification Passed");

		} else {
			System.out.println("Test Case Of HomePage Title Verification Failed");
		}

		System.out.println("Actual Title Of HomePage :" + actualTileofHomePage);

		driver.findElement(By.xpath("//a[text()='Mobile']")).click();

		String expectdTileofMobilePage = "Mobile";

		String actualTileofMobilePage = driver.getTitle();

		if (actualTileofMobilePage.equals(expectdTileofMobilePage)) {

			System.out.println("Test Case Of MobilePage Title Verification Passed");

		} else {
			System.out.println("Test Case Of MobilePage Title Verification Failed");
		}

		System.out.println("Actual Title of Mobile Page :" + actualTileofMobilePage);

		WebElement dropDownBOX = driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));

		Select s = new Select(dropDownBOX);

		s.selectByIndex(1);

		Thread.sleep(5000);

		List<WebElement> allMobile = driver.findElements(By.xpath("//h2/a"));

		// List<WebElement> allList=s.getOptions();

		// System.out.println(allList.size());

		for (int i = 0; i < allMobile.size(); i++) {

			String allElement = allMobile.get(i).getText();

			System.out.println("Name of Mobile :" + allElement);

		}
		
		driver.close();

	}

}
