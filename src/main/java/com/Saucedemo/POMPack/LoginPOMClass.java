package com.Saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass
{
//	1. webdriver globalley declare
	
     WebDriver driver;
     Actions act;
  
//  2. Find element with the help of annotations
  
    @FindBy(xpath="//input[@id='user-name']")
     WebElement Username;
  
    public void Username()
    {
    	Username.sendKeys("standard_user");
    }
    
    @FindBy(xpath="//input[@name='password']")
     WebElement password;
    
    public void password()
    {
    	password.sendKeys("secret_sauce");
    }
    
    @FindBy(xpath="//input[@value='Login']")
     WebElement Loginbutton;
    
    public void Loginbutton()
    {
//    	act.click(Loginbutton).perform();
    	Loginbutton.click();
    }
    
//   4. Constructor create
    
    public LoginPOMClass(WebDriver driver)
    {
    	this.driver=driver;
    	
    	PageFactory.initElements(driver, this);
    	 act = new Actions(driver);
    }
}
