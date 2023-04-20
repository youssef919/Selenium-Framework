

package tests;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;

import pages.ContactUs;
import pages.Homepage;
import pages.LoginPage;
import pages.MyAccountChangePassword;
import pages.MyAccountPage;
import pages.Registerationpage;
import pages.SearchPage;

public class TestCase extends TestBase {
	
	Homepage x;
	Registerationpage y;
	LoginPage z;
	MyAccountPage m;
	MyAccountChangePassword c;
	SearchPage s;
	String productname = "Apple MacBook Pro 13-inch";
	ContactUs u;
	
	
	
	
	  /// test case for contact us page
	
	@Test
	public void Testing0() {
		
		x = new Homepage(driver);
		x.opencontactus();
		u = new ContactUs(driver);
		u.entervaluerforcontactus("YoussefMohamed", "youssefelshemy99@gamil.com", "Hahaya");
		
	}
	
	/// test case for user register
	
	@Test(dependsOnMethods = {"Testing0"})
	public void Testing1() throws FileNotFoundException, IOException, ParseException {
		  
		
		JsonDataReader succ2 = new JsonDataReader();
		succ2.Reader();
		
		x = new Homepage(driver);
		x.clickregister();
		y = new Registerationpage(driver);
		y.registeraction(succ2.firstname,succ2.lastname,succ2.email,succ2.password);
	    Assert.assertTrue(y.successmessage.getText().contains("Your registration completed"));
		
		
	    
	}
	
	
	  // test case for click on login button 
	
	@Test(dependsOnMethods = {"Testing1"})
	public void Testing2() {
		
		x = new Homepage(driver);
		x.clicklogin();
	}
	
	
	  //  test case for insert data to login 
	
	@Test(dependsOnMethods = {"Testing2"})
	public void Testing3() throws FileNotFoundException, IOException, ParseException {
		  
		JsonDataReader succ2 = new JsonDataReader();
		succ2.Reader();
		  
		z = new LoginPage(driver);
		z.loginaction(succ2.email,succ2.password);
		
	}
	
	 // test case for click on My account page 
	
	@Test(dependsOnMethods = {"Testing3"})
	public void Testing4() {
		
		x = new Homepage(driver);
		x.clickMyAccount();
		
		
		
	}
	
	
	  // test case for change old password to new password

	@Test(dependsOnMethods = {"Testing4"})
	public void Testing5() throws FileNotFoundException, IOException, ParseException {
		
		JsonDataReader succ2 = new JsonDataReader();
		succ2.Reader();
		
		m = new MyAccountPage(driver);
		m.changepasswordaction();
		c = new MyAccountChangePassword(driver);
		c.Changepassword(succ2.password,"123456789","123456789");
		
	}
	   
	/// test case for search on value 
	
	@Test(dependsOnMethods = {"Testing5"})
	public void Testing6() {
		
		s = new SearchPage(driver);
		s.searchaction("macB");
		Assert.assertEquals(s.successproductname.getText(),"Apple MacBook Pro 13-inch");
	  
	}
	
	  // test case for test currency and test  hover menu
	@Test(dependsOnMethods = {"Testing6"})
	public void Testing7() {
		
		  s = new SearchPage(driver);
		  s.changecurrencyaction();
		  s.actionsmenu();
		  Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
		
		
		
	}
	
}
