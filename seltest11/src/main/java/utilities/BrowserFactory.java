package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserFactory {
	
	WebDriver BFdriver;
   
	
    	
	public BrowserFactory(WebDriver mydriver){

        this.BFdriver = mydriver;
        

        //This initElements method will create all WebElements

        PageFactory.initElements(mydriver, this);
	
	}
	
	
 
	
	
	//Opens the browser of choice and returns driver of type WebDriver
	public  WebDriver startBrowser(String browserName, String url)
	{
		
		if(browserName.equals("Firefox")){
			BFdriver = new FirefoxDriver();
			}
		else if (browserName.equals("Chrome")){
			BFdriver = new ChromeDriver();
			
		}
		else if (browserName.equals("IE")){
			BFdriver = new InternetExplorerDriver();
			
		}
		
		BFdriver.manage().window().maximize();
		BFdriver.get(url);
		
		return BFdriver;
		
		
	}
	
	

}
