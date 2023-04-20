package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	public WebDriver driver;
	public JavascriptExecutor jse;
	public Select select;
	public Actions action;
	
	//create constructor
	
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	 // create method for button click
	public void clickbutton(WebElement button) {
		button.click();
	}
	  //create method for Send key to box text
	public void keys( WebElement setboxtext, String value) {
		setboxtext.sendKeys(value);
		}
	 //create method for scroll to button
	
	public void scrolling() {
		
		jse.executeScript("scrollBy(0,2500)");
		
	}
	
	
	

}
