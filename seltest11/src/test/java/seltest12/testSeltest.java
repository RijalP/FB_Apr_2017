package seltest12;

import org.testng.annotations.Test;

import pages.Profilep;
import pages.SignIns;
import utilities.BrowserFactory;

//import pages.SignIn;
// utilities.BrowserFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


//import pages.Profile;

public class testSeltest {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	
	WebDriver driver;
	
	@Test(priority=0)
	public void testLoginFB() throws InterruptedException
	{
		Logger logger =Logger.getLogger(testSeltest.class);
		 
		
		 //Date and Time
		 
		 System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		  PropertyConfigurator.configure("Log4j.properties");
		logger.info("Test1 method testLogingFB started at CURRENTTIME of : " + dtf.format(now));
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/LajirMac/Downloads/chromedriver");
		BrowserFactory bfObj = new BrowserFactory(driver);
		driver = bfObj.startBrowser("Chrome","https://www.facebook.com");
		
		
		//BrowserFactory objBF = new BrowserFactory(driver);
		//objBF.startBrowser("Firefox", "https://www.facebook.com");
		// Created Page Object using Page Factory
		
		//obj
		SignIns login_page= new SignIns(driver);  //objBF.startBrowser("Firefox", "https://www.facebook.com"));
		
		
		
		
		login_page.LoginFB("praweshmail@gmail.com", "1Pass@123");
		 
		logger.info("LoginFB was ...completed at:" +dtf.format(now));
		logger.error("logger error");
		
		
		
	}
	
	@Test(priority=1)
	public void testStatusEntry() throws InterruptedException{
		
		Logger logger1 =Logger.getLogger(testSeltest.class);
		 PropertyConfigurator.configure("Log4j.properties");	
		logger1.info("Test2 method testStatusEntry started at CURRENTTIME of testSeltest" + dtf.format(now));
		//System.setProperty("webdriver.chrome.driver", "/Users/LajirMac/Downloads/chromedriver");
		//BrowserFactory bfObj = new BrowserFactory(driver);
		//driver = bfObj.startBrowser("Chrome","https://www.facebook.com");
		
		
		//System.setProperty("webdriver.gecko.driver", "/Users/LajirMac/Downloads/geckodriver");
	//WebDriver pdriver = BrowserFactory.startBrowser("Firefox","https://www.facebook.com");
		Thread.sleep(3000);
		Profilep statusFB = new Profilep(driver);
		//driver = BrowserFactory(pdriver);
		
		statusFB.EnterStatus("This is my test staus121");
		logger1.info("EnterStatus Profile page...completed at:" + dtf.format(now));
	}
	

}
