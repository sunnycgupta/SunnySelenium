package com.sunny.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SunnySeleniumRun {


	WebDriver driver;
	@Test
	public void runChrome() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/home/sunny/SeleniumSetup/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(10000);
	if (driver.getPageSource().contains("I'm Feeling Lucky")) {
              System.out.println("Pass");
      } else {
              System.out.println("Fail");
      }
      driver.quit();
	}
	
	@Test
	public void runFirefox() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/sunny/SeleniumSetup/geckodriver");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(10000);
	if (driver.getPageSource().contains("I'm Feeling Lucky")) {
              System.out.println("Pass");
      } else {
              System.out.println("Fail");
      }
      driver.quit();
	}
}
