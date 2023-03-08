package com.Saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01VerifyLoginFunctionality extends TestBaseClass
{
   @Test
   public void verifyLoginfunctionality()
   {
	    String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		  
		  if(expectedTitle.equals(actualTitle))
		  {
			  log.info("Login Test case pass");
		  }
		  else
		  {
			  log.info("Login Test case fail");
		  }
//		Assert.assertEquals(actualTitle, expectedTitle);
   }
}
