package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.Registerationpage;
import tests.TestBase;

public class UserRegister extends TestBase {
    
	Homepage homeobject;
	Registerationpage registerobject;
	
	@Given("The user in home page")
	public void the_user_in_home_page() {
		
		homeobject = new Homepage(driver);
		homeobject.clickregister();
	}
	@When("i click on register link")
	public void i_click_on_register_link() {
	
	}
	@When("i entered data user {string} {string} {string} {string}")
	public void i_entered_data_user(String firstname, String lastname, String email, String password) {
		
		registerobject = new Registerationpage(driver);
		registerobject.registeraction(firstname,lastname,email,password);
		
	}
	@Then("the page of registeration displayed successfuly")
	public void the_page_of_registeration_displayed_successfuly() {
		
		
	}

	
	
	
	
	
}
