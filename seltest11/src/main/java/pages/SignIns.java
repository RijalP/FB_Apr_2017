package pages;

//import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.log4testng.Logger;
//import org.testng.log4testng.Logger;
//import org.apache.log4j.Logger;
//import org.testng.Reporter;
//import org.apche.log4j.xml.DOMConfigurator;
//import utility.Log;


public class SignIns{
	
	WebDriver driver;
	
	public SignIns(WebDriver driver){
		this.driver = driver;
		 
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
		
	}
	 
	 
	
	
	
	//Username,Email, Password, loginBtn field
	
	





		@FindBy(name="email")
			WebElement Username;
		
		@FindBy(xpath= "//*[@id='pass']")
		WebElement Password;
		
		@FindBy(xpath ="id('u_0_q')") //---//*[@id="u_0_u"]
		WebElement LoginBtn;
		
		//Set user name in textbox
		public void setUsername(String User){
			Username.sendKeys(User);
			
		}
		
		//Set password in the password field
		public void setPassword(String Pass){
			 Password.sendKeys(Pass);
		}
		//Click login button
		public void clickLogin(){
			LoginBtn.sendKeys(Keys.RETURN);	
		}
		
		
		public void LoginFB(String User, String Pass) throws InterruptedException
		{
		// strlogger.info("Logging into my Account");	
		 this.setUsername(User);
		 this.setPassword(Pass);
		 Thread.sleep(3000);
		 this.clickLogin();
			
		}

}
