package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBase extends AbstractTestNGCucumberTests{
	
	
	public  static WebDriver driver;
	
	
	@BeforeSuite
	@Parameters({"browser"})
	public void startdriver(@Optional("chrome")  String browsername) {
		
		if (browsername.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver",System.getProperty(("user.dir")+"\\Drivers\\chromedriver.exe"));
			driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			//System.setProperty("webdriver.geckodriver.driver",System.getProperty(("user.dir")+"\\Drivers\\geckodriver.exe"));
			driver = new FirefoxDriver();
			
		}	
	
	       driver.manage().window().maximize();
	       driver.navigate().to("https://demo.nopcommerce.com/");
			
	}
	
	@AfterSuite
	public void closedriver() {
		
		driver.quit();
	}
	
	
	
	     //take screenshot when test case fail and added to Screenshots folder
	
	@AfterMethod
	 public void takescreenshot(ITestResult result) {
		 
		 if (result.getStatus() == ITestResult.FAILURE) {
			 
			 System.out.println("Failed!");
			 System.out.println("TAKING Screenshot .....");
			 Helper.capturescreenshot(driver,result.getName());
		}
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
