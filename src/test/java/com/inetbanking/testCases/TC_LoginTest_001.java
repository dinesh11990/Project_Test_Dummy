package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPageObject;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		LoginPageObject lp=new LoginPageObject(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		
		if(driver.getTitle().equals("Guru99 Bank Home Page"))
		{
			AssertJUnit.assertTrue(true);
		}
		else
		{
			AssertJUnit.assertTrue(false);
		}
		
	}

}
