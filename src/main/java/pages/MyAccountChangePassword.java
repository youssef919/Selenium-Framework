package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountChangePassword extends PageBase {

	public MyAccountChangePassword(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "OldPassword")
	WebElement oldpasswordlink;
	
	
	@FindBy(id = "NewPassword")
	WebElement newpasswordlink;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement confpasslink;
	
	@FindBy(css = "button.button-1.change-password-button")
	WebElement changepasslink;
	
	
	public void Changepassword(String odpass, String newpass , String fpass) {
		
		keys(oldpasswordlink,odpass);
		keys(newpasswordlink, newpass);
		keys(confpasslink, fpass);
		clickbutton(changepasslink);
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
