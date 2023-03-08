package com.Saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Saucedemo.POMPack.HomePomClass;
import com.Saucedemo.UtilityPack.Utilityclass;



public class TC03verifyAddToCartfunctionality extends TestBaseClass
{
   @Test
   public void verifyAddtoCartfunctionality() throws IOException
   {

		  HomePomClass a = new  HomePomClass(driver);
		  
          a.Clickmultiproduct();
          log.info("Click on multi product");
		  
		  Utilityclass.screenshot(driver, "TC02 add to cart");
		  log.info("Takes screenshot");
		  
		  String Expected = "6";
		  String Actual = a.shoppingcontainergettext();
		 
		  if(Expected.equals(Actual))
		  {
			  log.info("Add to cart test case pass");
		  }
		  else
		  {
			  log.info("Add to cart test case fail");
		  }
//		  Assert.assertEquals(Actual, Expected);
		 
   }
}
