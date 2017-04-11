package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilep {
	WebDriver Pdriver;
	
	public Profilep(WebDriver driver){
		this.Pdriver = driver;
		
		//This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
	}
	
	//Profile page click
	@FindBy(xpath="//*[@id='u_0_4']/div[1]/div[1]/div/a/span")
	WebElement ProfileLink;
	
	//About link
		@FindBy(xpath="//*[contains(@id,'u_jsonp')]/div/a[2]")    
		WebElement AboutLink;
	
	//WorkEduLink
	@FindBy(xpath="//*[contains(@id,'u_jsonp')]/div/ul/li[2]/a")
	WebElement WorkEduLink;         
	
	
	
	//AddWorkLink
	@FindBy(xpath="//*[contains(@id,'u_')]/ul/li/a") //*[@id="u_8_0"]/ul/li/a
	WebElement AddWork;
	
	
	
	
	
	//Methods of Profile
	public  void EnterStatus(String mystatus) throws InterruptedException{
		ProfileLink.click();
		Thread.sleep(3000);
		//IStatusEdit.sendKeys(mystatus);
		AboutLink.click();
		Thread.sleep(3000);
		WorkEduLink.click();
		//AStatusEdit.sendKeys(mystatus + "Active");
		AddWork.click();
		Thread.sleep(3000);
		//Pdriver.navigate().back();
		Pdriver.navigate().back();
		
			
	}

}
