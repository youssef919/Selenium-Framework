package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactUs extends PageBase {

	public ContactUs(WebDriver driver) {
		super(driver);
		
	}
		
		@FindBy(id = "FullName")
		WebElement yournameelement;
		
		
		@FindBy(id = "Email")
		WebElement youremail;
		
		
		@FindBy(id = "Enquiry")
		WebElement enquiryelement;
		
		@FindBy(css = "button.button-1.contact-us-button")
		WebElement submitbtn;
		
		
		
		public void entervaluerforcontactus(String namekey,String emailkey,String equirykey) {
			
		 keys(yournameelement,namekey );
		 keys(youremail, emailkey);
		 keys(enquiryelement, equirykey);
		 clickbutton(submitbtn);
			
			
			
			
		}
		
		
		
		
		
		
	

}
