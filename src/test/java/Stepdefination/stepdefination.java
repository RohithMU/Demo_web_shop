package Stepdefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elements.elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination extends elements 
{
    public stepdefination() 
    {
        super(new ChromeDriver());
    }

    @Given("User is on login page")
    public void user_is_on_login_page() throws Exception 
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/rohit/OneDrive/Desktop/Selenium/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver.get("https://demowebshop.tricentis.com/");
        dfind(Login_In);
    }

    @When("^User enters valid (.*) and (.*)$")
    public void user_enters_valid_rohithpatilmu_gmail_com_and_rohithmu(String username, String password) 
    {
        dfind(Email, username);
        dfind(Password, password);
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() 
    {
        dfind(Login_In1);
    }

    @Then("User is able to navigate homepage")
    public void user_is_able_to_navigate_homepage() 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement account = wait.until(ExpectedConditions.visibilityOfElementLocated(Account));
    	String expected = account.getText();
    	String actual="rohithpatilmu@gmail.com";
        assertEquals(expected,actual);
        quit();
    }
    @When("^User enters invalid (.*) and (.*)$")
    public void user_enters_invalid_rohithpatilmu_gmail_com_and_rohithmu(String username, String password) 
    {
    	dfind(Email, username);
        dfind(Password, password);
    }
    @Then("User is not able to navigate homepage")
    public void user_is_not_able_to_navigate_homepage() 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement lerror = wait.until(ExpectedConditions.visibilityOfElementLocated(Lerror));
    	String expected = lerror.getText();
    	String actual="Login was unsuccessful. Please correct the errors and try again.";
        assertEquals(expected,actual);
    	quit();
    }
    //quitting the browser
    public void quit()
    {
    	driver.quit();
    }
}
