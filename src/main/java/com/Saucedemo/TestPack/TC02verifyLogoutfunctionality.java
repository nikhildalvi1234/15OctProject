package com.Saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Saucedemo.POMPack.HomePomClass;





public class TC02verifyLogoutfunctionality extends TestBaseClass
{
  @Test
  public void verifylogoutfunctionality()
  {
	  HomePomClass y = new HomePomClass(driver);
	  
		 
	  y.Clicksettingbutton();
	  log.info("Click setting button");
	  
	  y.ClickLogoutbutton();
	  log.info("Click Logout button");
	  
	 
	  String expected = "https://www.saucedemo.com/";
	  log.info(expected);
	  String actual = driver.getCurrentUrl();
	  log.info(actual);
	  
	  if(expected.equals(actual))
	  {
		  log.info("Logout test case is pass");
	  }
	  else
	  {
		  log.info("Logout test case is fail");
	  }
//	  Assert.assertEquals(actual, expected);
	  
  }
}
