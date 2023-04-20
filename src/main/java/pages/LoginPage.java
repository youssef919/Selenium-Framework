package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
    
	
	
	@FindBy(id = "Email")
	WebElement emaillinkelement;
	
	
	
	@FindBy(id = "Password")
	WebElement passwordlinkelement;
	
	
	@FindBy(css = "button.button-1.login-button")
	WebElement loginbtnelement;
	
	
	
	
	public void loginaction(String emailtxt, String passtxt) {
		
		keys(emaillinkelement, emailtxt);
		keys(passwordlinkelement, passtxt);
		clickbutton(loginbtnelement);
		
	}
	
	
}
