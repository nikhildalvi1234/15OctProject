package com.Saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePomClass 
{
	 WebDriver driver;
	 Actions act;
	 Select s;
	
	
//	Filter Dropdown
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	 WebElement Filter;
	
	public void DropDown()
	{
//		s.selectByIndex(3);
//		s.selectByValue("hilo");
		s.selectByVisibleText("Price (high to low)");
	}
	
//	Sort product
	
	@FindBy(xpath="//div[contains(@class, 'item_name')]")
	 List<WebElement> Allproduct;
	
	public void Allproduct()
	
	{
		for(int i = 0;i<Allproduct.size();i++)
		{
			String x = Allproduct.get(i).getText();
			
			System.out.println(x);
		}
	
	}
//   for single product Add to cart
   
   @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement Bagproduct;
   
   public void ClickonBagProduct()
   {
//	   act.click(Bagproduct).perform(); 
	   Bagproduct.click();
   }
   
   
   
//   for multiple product Add to cart
   
   @FindBy(xpath="//button[text()='Add to cart']")
    List<WebElement> multiproduct;
   
   public void Clickmultiproduct()
   {
	   
	   for(WebElement x: multiproduct)
	   {
//		   act.click(x).perform();
		   x.click();
		   
	   }
	   
   }
   
//   Shopping container
   
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
    WebElement shoppingcontainer;
   
   public String shoppingcontainergettext ()
   {
	   String x=shoppingcontainer.getText() ;
	   return x;
   }
  
   
   
   @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    WebElement Settingbutton;
   
   public void Clicksettingbutton()
   {
//	   act.click(Settingbutton).perform();
	   Settingbutton.click();
   }
   
   @FindBy(xpath="//a[@id='logout_sidebar_link']")
    WebElement Logoutbutton;
   
   public void ClickLogoutbutton()
   {
//	   act.click(Logoutbutton).perform();
	   Logoutbutton.click();
   }
   
//   Click on shopping cart container
   
   @FindBy(xpath="//div[@id='shopping_cart_container']")
    WebElement Shoppingcontainer;
   
   public void Clickshoppingcontainer()
   {
//	   act.click(Shoppingcontainer).perform();
	   Shoppingcontainer.click();
   }
   
//   Click on checkout button
   
   @FindBy(xpath="//button[@id='checkout']")
    WebElement Checkoutbutton;
   
   public void Clickcheckoutbutton()
   {
//	   act.click(Checkoutbutton).perform();
	   Checkoutbutton.click();
   }
   
//  Fill checkout information
   
   @FindBy(xpath="//input[@id='first-name']")
    WebElement Firstname;
   
   public void firstname()
   {
	   Firstname.sendKeys("siddhesh");
   }
   
//   last name
   
   @FindBy(xpath="//input[@id='last-name']")
    WebElement Lastname;
   
   public void lastname()
   {
	   Lastname.sendKeys("dalvi"); 
   }
   
//   zip code
   
   @FindBy(xpath="//input[@id='postal-code']")
    WebElement postalcode;
   
   public void postalcode()
   {
	   postalcode.sendKeys("411018"); 
   }
   
//   Click on continue
   
   @FindBy(xpath="//input[@id='continue']")
    WebElement continuebutton;
   
   public void continuebutton()
   {
//	   act.click(continuebutton).perform();
	   continuebutton.click();
   }
   
//   Click on finishbutton
   
   @FindBy(xpath="//button[@id='finish']")
    WebElement Finishbutton;
   
   public void Finishbutton()
   {
//	   act.click(Finishbutton).perform();
	   Finishbutton.click();
   }
   
//   Click on Back home
   
   @FindBy(xpath="//button[@id='back-to-products']")
    WebElement Backhomebutton;
   
   public void Backhomebutton()
   {
//	   act.click(Backhomebutton).perform();
	   Backhomebutton.click();
   }
   
   @FindBy(xpath="//button[text()='Close Menu']")
    WebElement crossbutton;
   
   public void crossbutton()
   {
//	   act.click(crossbutton).perform();
	   crossbutton.click();
   }
   
   
   public HomePomClass(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	    act = new Actions(driver);
	     s = new Select(Filter);
			   
   }
}
