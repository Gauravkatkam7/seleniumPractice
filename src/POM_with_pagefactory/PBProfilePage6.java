package POM_with_pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage6 {

	@FindBy(xpath="//input[@name=\"personName\"]")private WebElement fullname;
	WebDriver driver1;
	public PBProfilePage6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void swithToChildBrowser()
	{
		Set<String> allId = driver1.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allId);
		driver1.switchTo().window(ar.get(1));
	}
	public void verifyPBProfilePage6FullName()
	{
		String actName=fullname.getAttribute("value");
		String expName="gaurav katkam";
		if(expName.equals(actName))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}
}
