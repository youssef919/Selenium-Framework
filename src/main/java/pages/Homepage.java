package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase {

	public Homepage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(linkText ="Register")
	WebElement registerlink;
	
	@FindBy(css = "div.result")
	 public WebElement successmessage;
	
	
	@FindBy(css = "a.ico-login")
	WebElement loginlink;
	
	@FindBy(css = "a.ico-account")
	WebElement myaccountlink;
	
	
	@FindBy(linkText = "Contact us")
	WebElement contactuslinkl;
	
	
	
	
	public void clickregister() {
		
		clickbutton(registerlink);
		
		
	}
	
	
	public void clicklogin() {
		
		clickbutton(loginlink);
		
	}


	
    public void clickMyAccount() {
		
		clickbutton(myaccountlink);
		
	}

    public void opencontactus() {
    	scrolling();
    	clickbutton(contactuslinkl);
    	
    	
    }
    
    
    

	
	
	
	

}
