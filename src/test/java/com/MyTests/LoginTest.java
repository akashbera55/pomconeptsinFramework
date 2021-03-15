package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "actiTIME - Login");
	}
	
	@Test(priority=2)
	public void verifyLoginPageHeaderTest()
	{
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Please identify yourself");
	}
	
	@Test(priority=3)
	public void doLoginTest()
	{
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("admin", "manager");
		String headerHome = homepage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "Switch to actiPLANS");
	}
}
