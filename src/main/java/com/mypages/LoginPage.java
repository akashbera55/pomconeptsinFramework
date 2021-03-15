package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//page locators
	
	private By username = By.id("username");
	private By password = By.name("pwd");
	private By loginButton = By.id("loginButton");
	private By header = By.id("headerContainer");
	
	//public getters
	public WebElement getUsername() {
		return getElement(username);
	}
	
	public WebElement getPassword() {
		return getElement(password);
	}


	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	//page actions
	public String getLoginPageTitle()
	{
		return getPageTitle();
	}
	
	public String getLoginPageHeader(){
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username, String pwd)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}

	public void doLogin()
	{
		getUsername().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();	
	}
	
	public void doLogin(String userCred)
	{
		if(userCred.contains("username")){
			getUsername().sendKeys(userCred.split(":")[1].trim());
		}
		else if(userCred.contains("password")){
			getPassword().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();
	}
					
}
