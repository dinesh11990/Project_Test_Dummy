package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL= "http://demo.guru99.com/v4/index.php";
	public String username="Mngr324393";
	public String password="yqevYzu";
	public static WebDriver driver;
	
	
	@BeforeClass
	 public void setup()
	 {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	 
	@AfterMethod
	@AfterClass
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
