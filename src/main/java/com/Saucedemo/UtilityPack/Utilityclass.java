package com.Saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass 
{
  public static void screenshot(WebDriver driver,String name) throws IOException
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File image = ts.getScreenshotAs(OutputType.FILE);
	  File path = new File("G:\\Screenshot\\"+name+".jpg");
	  FileHandler.copy(image, path);
  }
}
