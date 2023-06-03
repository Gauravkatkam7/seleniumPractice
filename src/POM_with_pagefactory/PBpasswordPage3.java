package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpasswordPage3 {

	@FindBy(xpath="//input[@name=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")WebElement signIn;
	
	public PBpasswordPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPwd()
	{
		pwd.sendKeys("Gaurav@8382");
	}
	public void clickOnSignInBtn()
	{
		signIn.click();
	}
}
