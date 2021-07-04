package com.sunny.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SunnyRemoteDriverDocker {

	 WebDriver driver;
     String baseURL, nodeURL;

   @Test
     public void setUpChrome() throws MalformedURLException, Exception {
         baseURL = "http://demo.guru99.com/test/guru99home/";
         nodeURL = "http:localhost:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("chrome");
         capability.setPlatform(Platform.LINUX);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
         
         driver.get(baseURL);
         Thread.sleep(10000);

         if (driver.getPageSource().contains("MOBILE TESTING")) {
        	   System.out.println("Pass");
         } else {
        	 System.out.println("Fail");
         }
         driver.quit();
     }

   @Test
     public void setUpFirefox() throws MalformedURLException, Exception {
         baseURL = "http://demo.guru99.com/test/guru99home/";
         nodeURL = "http:localhost:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.firefox();
         capability.setBrowserName("firefox");
         capability.setPlatform(Platform.LINUX);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
         
         driver.get(baseURL);
         Thread.sleep(10000);

         if (driver.getPageSource().contains("MOBILE TESTING")) {
        	   System.out.println("Pass");
         } else {
        	 System.out.println("Fail");
         }
         driver.quit();
     }
     
     
}
