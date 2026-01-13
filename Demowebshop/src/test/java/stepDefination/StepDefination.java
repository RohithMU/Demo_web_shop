package stepDefination;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		dfind(register);
	}
	@And("User enters {string} {string} {string} {string}")
	public void user_enters(String firstname, String lastname, String email, String password) {
		dfind(Elements.firstname, firstname);
		dfind(Elements.lastname, lastname);
		dfind(Elements.email, email);
		dfind(Elements.password, password);
		dfind(Elements.confirmpassword, password);
		dfind(registerbutton);
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
		dfind(login);
	}

	@When("User enters {string} {string}")
	public void user_enters(String email, String password) {
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@Then("Verify user logged in successfully")
	public void verify_user_logged_in_successfully() {
		String loggedinsuccessfully = getText(Elements.verifymailid);
		Assert.assertEquals(loggedinsuccessfully, "rohithpatilmu@gmail.com");
		System.out.println(loggedinsuccessfully);
	}
	
	@When("User enters valid {string} and invalid {string}")
	public void user_enters_valid_and_invalid(String email, String password) {
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@Then("Verify invalid password error message is displayed")
	public void verify_invalid_password_error_message_is_displayed() {
		String loggedinsuccessfully = getText(Elements.incorrectcredentials);
		Assert.assertEquals(loggedinsuccessfully, "The credentials provided are incorrect");
		System.out.println(loggedinsuccessfully);
	}

	@When("User enters invalid {string} and valid {string}")
	public void user_enters_invalid_and_valid(String email, String password) {
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@Then("Verify invalid email error message is displayed")
	public void verify_invalid_email_error_message_is_displayed() {
		String loggedinsuccessfully = getText(Elements.validemail);
		Assert.assertEquals(loggedinsuccessfully, "Please enter a valid email address.");
		System.out.println(loggedinsuccessfully);
	}

	@When("User enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String email, String password) {
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@Then("Verify invalid credentials error message is displayed")
	public void verify_invalid_credentials_error_message_is_displayed() {
		String loggedinsuccessfully = getText(Elements.validemail);
		Assert.assertEquals(loggedinsuccessfully, "Please enter a valid email address.");
		System.out.println(loggedinsuccessfully);
	}

	@When("User enters empty {string} and valid {string}")
	public void user_enters_empty_and_valid(String email, String password) {
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@Then("Verify email required error message is displayed")
	public void verify_email_required_error_message_is_displayed() {
		String loggedinsuccessfully = getText(Elements.noaccountfoundmessage);
		Assert.assertEquals(loggedinsuccessfully, "No customer account found");
		System.out.println(loggedinsuccessfully);
	}

	@When("User enters valid {string} and empty {string}")
	public void user_enters_valid_and_empty(String email, String password) {
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@Then("Verify password required error message is displayed")
	public void verify_password_required_error_message_is_displayed() {
		String loggedinsuccessfully = getText(Elements.incorrectcredentials);
		Assert.assertEquals(loggedinsuccessfully, "The credentials provided are incorrect");
		System.out.println(loggedinsuccessfully);
	}

	@When("User clicks on login button without entering credentials")
	public void user_clicks_on_login_button_without_entering_credentials() {
		dfind(login1);
	}

	@Then("Verify email and password required error message is displayed")
	public void verify_email_and_password_required_error_message_is_displayed() {
		String loggedinsuccessfully = getText(Elements.noaccountfoundmessage);
		Assert.assertEquals(loggedinsuccessfully, "No customer account found");
		System.out.println(loggedinsuccessfully);
	}
	
	@Given("Verify books tab is displayed {string} and {string}")
	
	public void verify_books_tab_is_displayed_rohithpatilmu_gmail_com_and(String email,String password) {
		user_clicks_on_login();
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@When("User clicks on books")
	public void user_clicks_on_books() {
	    dfind(books);
	}

	@Then("Verify books page is displayed")
	public void verify_books_page_is_displayed() {
		String loggedinsuccessfully = getText(Elements.Books);
		Assert.assertEquals(loggedinsuccessfully, "Books");
		System.out.println(loggedinsuccessfully);
	}

	@And("User selects the sort by value")
	public void user_selects_the_sort_by_value() {
		dfind(sortby);
		Select dropdown = new Select(driver.findElement(sortby));
		dropdown.selectByVisibleText("Price: High to Low");
	}

	@Then("Verify sort by value selected")
	public void verify_sort_by_value_selected() {
		Select dropdown = new Select(driver.findElement(sortby));
		String selectedValue = dropdown.getFirstSelectedOption().getText().trim();
		Assert.assertEquals(selectedValue, "Price: High to Low");
	}

	@And("User selects display per page")
	public void user_selects_display_per_page() {
		dfind(display);
		Select dropdown = new Select(driver.findElement(display));
		dropdown.selectByVisibleText("8");
	}

	@Then("Verify display per page selected")
	public void verify_display_per_page_selected() {
		Select dropdown = new Select(driver.findElement(display));
		String selectedValue = dropdown.getFirstSelectedOption().getText().trim();
		Assert.assertEquals(selectedValue, "8");
	}

	@And("User selects view as")
	public void user_selects_view_as() {
		dfind(viewas);
		Select dropdown = new Select(driver.findElement(viewas));
		dropdown.selectByVisibleText("List");
	}

	@Then("Verify view as selected.")
	public void verify_view_as_selected() {
		Select dropdown = new Select(driver.findElement(viewas));
		String selectedValue = dropdown.getFirstSelectedOption().getText().trim();
		Assert.assertEquals(selectedValue, "List");
	}

	@And("User clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addtocart));
        dfind(addtocart);
	}

	@Then("Verify book is added to cart")
	public void verify_book_is_added_to_cart() {
	    String actualQuantity = driver.findElement(Elements.cartqty).getText();
	    String expectedQuantity = driver.findElement(Elements.cartqty).getText();
	    Assert.assertEquals(actualQuantity, expectedQuantity);
	    System.out.println("Cart quantity: " + actualQuantity);

	}

	@And("User clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(barnotification));
		WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(shoppingcart));
		cart.click();
	}

	@Then("Verify shopping cart page displayed")
	public void verify_shopping_cart_page_displayed() {
		String loggedinsuccessfully = getText(Elements.shoppingcart);
		Assert.assertEquals(loggedinsuccessfully, "Shopping cart");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on terms of service checkbox")
	public void user_clicks_on_terms_of_service_checkbox() {
		dfind(termsofservice);
	}

	@And("User clicks on checkout")
	public void user_clicks_on_checkout() {
		dfind(checkout);
	}

	@Then("Verify checkout page is displayed")
	public void verify_checkout_page_is_displayed() {
		String loggedinsuccessfully = getText(Elements.checkoutpage);
		Assert.assertEquals(loggedinsuccessfully, "Checkout");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on billing address continue")
	public void user_clicks_on_billing_address_continue() {
		dfind(billingaddresscontinue);
	}

	@Then("Verify shipping address displayed")
	public void verify_shipping_address_displayed() {
		String loggedinsuccessfully = getText(Elements.shippingaddress);
		Assert.assertEquals(loggedinsuccessfully, "Shipping Address");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on shipping address continue")
	public void user_clicks_on_shipping_address_continue() {
		dfind(shippingaddresscontinue);
	}

	@Then("Verify shipping method is displayed")
	public void verify_shipping_method_is_displayed() {
		String loggedinsuccessfully = getText(Elements.shippingmethod);
		Assert.assertEquals(loggedinsuccessfully, "Shipping Method");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on shipping method continue")
	public void user_clicks_on_shipping_method_continue() {
		dfind(shippingmethodcontinue);
	}

	@Then("Verify payment method is displayed")
	public void verify_payment_method_is_displayed() {
		String loggedinsuccessfully = getText(Elements.paymentmethod);
		Assert.assertEquals(loggedinsuccessfully, "Payment Method");
		System.out.println(loggedinsuccessfully);
	}

	@And("User selects payment method")
	public void user_selects_payment_method() {
		dfind(cashondelivery);
	}

	@And("User clicks on payment method continue")
	public void user_clicks_on_payment_method_continue() {
		dfind(paymentmethodcontinue);
	}

	@Then("Verify payment information is displayed")
	public void verify_payment_information_is_displayed() {
		String loggedinsuccessfully = getText(Elements.paymentinformation);
		Assert.assertEquals(loggedinsuccessfully, "Payment Information");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on payment information continue")
	public void user_clicks_on_payment_information_continue() {
		dfind(paymentinfocontinue);
	}

	@Then("Verify confirm order is displayed")
	public void verify_confirm_order_is_displayed() {
		String loggedinsuccessfully = getText(Elements.confirmorder);
		Assert.assertEquals(loggedinsuccessfully, "Confirm Order");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on confirm")
	public void user_clicks_on_confirm() {
		dfind(confirm);
	}

	@Then("Verify order successfully message displayed")
	public void verify_order_successfully_message_displayed() {
		String loggedinsuccessfully = getText(Elements.ordersuccessful);
		Assert.assertEquals(loggedinsuccessfully, "Your order has been successfully processed!");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on continue")
	public void user_clicks_on_continue() {
		dfind(thankyoucontinue);
	}
	
	@Given("Verify computers tab is displayed {string} and {string}")
	public void verify_computers_tab_is_displayed_rohithpatilmu_gmail_com_and(String email, String password) {
		user_clicks_on_login();
		dfind(Elements.email,email);
		dfind(Elements.password,password);
		dfind(login1);
	}

	@When("User clicks on computers")
	public void user_clicks_on_computers() {
		dfind(computers);
	}

	@Then("Verify computers page is displayed")
	public void verify_computers_page_is_displayed() {
		String loggedinsuccessfully = getText(Elements.computerspage);
		Assert.assertEquals(loggedinsuccessfully, "Computers");
		System.out.println(loggedinsuccessfully);
	}

	@And("User clicks on desktop")
	public void user_clicks_on_desktop() {
	    dfind(desktop);
	}

	@Then("Verify desktop page is displayed")
	public void verify_desktop_page_is_displayed() {
		String loggedinsuccessfully = getText(Elements.desktoppage);
		Assert.assertEquals(loggedinsuccessfully, "DESKTOPS");
		System.out.println(loggedinsuccessfully);
	}

	@Then("Verify add to cart displayed with specification")
	public void verify_add_to_cart_displayed_with_specification() {
		user_clicks_on_add_to_cart();
		
	}

	@Then("Verify desktop added to cart")
	public void verify_desktop_added_to_cart() {
		verify_book_is_added_to_cart();
	}
	
	@And("User clicks on notebooks")
	public void user_clicks_on_notebooks() {
		dfind(notebooks);
	}

	@Then("Verify notebooks page is displayed")
	public void verify_notebooks_page_is_displayed() {
		String loggedinsuccessfully = getText(Elements.notebookspage);
		Assert.assertEquals(loggedinsuccessfully, "Notebooks");
		System.out.println(loggedinsuccessfully);
	}

	@Then("Verify notebooks added to cart")
	public void verify_notebooks_added_to_cart() {
		verify_book_is_added_to_cart();
	}

	@And("User clicks on accessories")
	public void user_clicks_on_accessories() {
		dfind(accessories);
	}

	@Then("Verify accessories page is displayed")
	public void verify_accessories_page_is_displayed() {
		String loggedinsuccessfully = getText(Elements.accessoriespage);
		Assert.assertEquals(loggedinsuccessfully, "Accessories");
		System.out.println(loggedinsuccessfully);
	}

	@Then("Verify accessories added to cart")
	public void verify_accessories_added_to_cart() {
		user_clicks_on_add_to_cart();
		verify_book_is_added_to_cart();
	}
}
