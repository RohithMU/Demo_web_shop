package stepDefination;

import org.testng.Assert;

import elements.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class StepDefination extends Elements{

	public StepDefination() {
		super(DriverFactory.getDriver());
	}

	@Given("Verify home page is displayed")
	public void verify_home_page_is_displayed() {
		String homepage=driver.getTitle();
		Assert.assertEquals(homepage, "Demo Web Shop");
		System.out.println(homepage);
	}

	@When("User clicks on register")
	public void user_clicks_on_register() {
		click(register);
	}
	@And("User enters {string} {string} {string} {string}")
	public void user_enters(String firstname, String lastname, String email, String password) {
		sendKeys(Elements.firstname, firstname);
		sendKeys(Elements.lastname, lastname);
		sendKeys(Elements.email, email);
		sendKeys(Elements.password, password);
		sendKeys(Elements.confirmpassword, password);
		click(registerbutton);
	}

	@Then("Verify new user registered successfully")
	public void verify_new_user_registered_successfully() {
		String registerednewuser = getText(Elements.result);
		Assert.assertEquals(registerednewuser, "Your registration completed");
		System.out.println(registerednewuser);
	}
	@Then("Verify user already existed")
	public void verify_user_already_existed() {
		String registerednewuser = getText(Elements.emailalreadyexist);
		Assert.assertEquals(registerednewuser, "The specified email already exists");
		System.out.println(registerednewuser);
	}
	@When("User clicks on login")
	public void user_clicks_on_login() {
	    click(login);
	}

	@When("User enters {string} {string}")
	public void user_enters(String email, String password) {
		sendKeys(Elements.email,email);
		sendKeys(Elements.password,password);
		click(login1);
	}

	@Then("Verify user logged in successfully")
	public void verify_user_logged_in_successfully() {
		String loggedinsuccessfully = getText(Elements.verifymailid);
		Assert.assertEquals(loggedinsuccessfully, "rohithpatilmu@gmail.com");
		System.out.println(loggedinsuccessfully);
	}
}
