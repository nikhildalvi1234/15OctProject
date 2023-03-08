package com.Saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucedemo.POMPack.LoginPOMClass;
import com.Saucedemo.UtilityPack.Utilityclass;





public class TestBaseClass 
{
	WebDriver driver;
	Logger log = Logger.getLogger("SauceDemo-15OctProject");
    @Parameters("browserName")
	@BeforeMethod
	
	public void setup(String browserName) throws IOException
	{
		if(browserName.equals("Chrome"))
		{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\chromedriver_win32\\chromedriver.exe");
		 
		  driver = new ChromeDriver();
	    }
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			 
			  driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Throw error");
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
		  driver.get("https://www.saucedemo.com/");
		  log.info("URL is open");
		  
		  driver.manage().window().maximize();
		  log.info("Browser is maximized");
		  
		  Utilityclass.screenshot(driver, "Login page");
		  log.info("Takes screenshot on login page");
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  LoginPOMClass x = new LoginPOMClass(driver);
		  
		  x.Username();
		  log.info("Username is entered");
		  
		  x.password();
		  log.info("password is entered");
		  
		  x.Loginbutton();
		  log.info("Click on login button");
		  
		  log.info("went to homepage");
		  
	}
	

	@AfterMethod
	
	public void teardown()
	{
		driver.close();
		log.info("Browser is closed");
		  
	}
}
