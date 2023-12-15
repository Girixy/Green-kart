package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	 public static WebDriver browser(String browser) {
		 
		 if(browser.equals("edge")) {
			 
		 WebDriverManager.edgedriver().setup();
		 
		 driver=new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 }
		 
		 else if (browser.equals("firefox")) {
			 
			 WebDriverManager.firefoxdriver().setup();
			 
			 driver=new FirefoxDriver();
			 
			 driver.manage().window().maximize();
			 
		 }
		 
		 else if(browser.equals("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\DELL\\Desktop\\GIRI GREENS\\project03\\Driver\\chromedriver.exe");
			 
			 driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
		 }
		return driver;
	 }
	 
	 public static void getUrl(String url) {
		 
		driver.get(url);
		 
	 }
	 
	 public static void getTitle() {
		 
		 String title = driver.getTitle();
		 System.out.println(title);
	 }

      
}
