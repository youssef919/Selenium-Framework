package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends PageBase{

	


	public SearchPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	
	
	
	
	
	@FindBy(id = "small-searchterms")
	WebElement searchbox;
	
	
	@FindBy(css = "button.button-1.button-1.search-box-button")
	WebElement searchbtn;
	
	@FindBy(id = "ui-id-1")
	List<WebElement> autocompletesarech;
	
	
	@FindBy(id = "customerCurrency")
	WebElement changecurrencylink;
	

	
	
	
	@FindBy(css = "strong.current-item")
	 public WebElement successproductname;
	@FindBy(linkText = "Computers")
	WebElement computermenulink;
	
	@FindBy(linkText = "Notebooks")
	WebElement notebookinmenu;
	 
	@FindBy(css = "strong.current-item")
	 public WebElement sucessmsg;
	
	
	
	public void searchaction(String searchname) {
		
		keys(searchbox,searchname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		autocompletesarech.get(0).click();
		
	
	}
	

    public void changecurrencyaction() {
    	
    	select = new Select(changecurrencylink);
    	select.selectByVisibleText("Euro");
    	
    	
    }
    
 
	
	
	   
    public void actionsmenu() {
    	
    	
    	action.moveToElement(computermenulink).moveToElement(notebookinmenu).click().build().perform();   	
    	
    }
    
    
	

}
