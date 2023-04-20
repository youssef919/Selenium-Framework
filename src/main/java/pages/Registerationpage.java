package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerationpage extends PageBase {

	public Registerationpage(WebDriver driver) {
		super(driver);
		 
	
	}
	
	
	
	@FindBy(id = "gender-male")
	WebElement genderlink;
	
	@FindBy(id = "FirstName")
	WebElement firstnamelink;
	
	
	@FindBy(id = "LastName")
	WebElement lastnamelink;
	
	@FindBy(id = "Email")
	WebElement emaillink;
	
	@FindBy(id = "Password")
	WebElement passlink;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmpasslink;
	
	@FindBy(id = "register-button")
	WebElement registerbuttonlink;
	
	@FindBy(css = "div.result")
	 public WebElement successmessage;
	
	
	public void registeraction(String firstname, String lastname, String email, String password) {
		
		keys(firstnamelink,firstname);
		keys(lastnamelink,lastname);
	    keys(emaillink, email);
	    keys(passlink,password);
	    keys(confirmpasslink,password);
	    clickbutton(genderlink);
	    clickbutton(registerbuttonlink);
	    
	    
	}
	
	
	
	
	
	
	
	

}
