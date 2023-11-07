package mind.mindqsep2023bddframework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mindq.mindqsep2023bddframework.pageobjects.LoginPage;

public class LoginStepDefintions extends LoginPage {

	
	//@Given("User is in login page")
	@Before
	public void user_is_in_login_page() {

		launchApp("Chrome");

	}

	@When("User enters email id {string}")
	public void user_enters_email_id(String string) {
	   enterEmailId(string);
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
	  enterPassword(string);
	}
	
	
	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
		clickSignInButton();
	}

	@Then("User should be able to login to the application")
	public void user_should_be_able_to_login_to_the_application() {

		boolean actualResult = allProjectsTextPresence();

		Assert.assertTrue(actualResult);

	}

	@Then("User should see the error message on the login screen")
	public void user_should_see_the_error_message_on_the_login_screen() {

		boolean actualResult = errorMessagePresence();

		Assert.assertFalse(actualResult);

	}
	

	
	@After
	 public void tearDown(Scenario scenario) {
		  if (scenario.isFailed()) {
		      // Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(screenshot, "image/png", "screenshot"); 
		     
		    }
		  
			closeBrowser();

}
}	
