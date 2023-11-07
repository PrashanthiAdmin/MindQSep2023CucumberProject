package mindq.mindqsep2023bddframework.pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import mindq.mindqsep2023bddframework.base.Base;



public class LoginPage extends Base {

	public static By emailInputBox = By.id("user_email");
	public static By passwordInputBox = By.id("user_password");
	public static By signinButton = By.name("commit");
	public static By errorMessage = By.xpath("//p[text()='Invalid email or password.']");
	public static By allProjectsText = By.id("ember60");

	public static void enterEmailId(String email) {

		try {
			
			driver.findElement(emailInputBox).clear();
			driver.findElement(emailInputBox).sendKeys(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void enterPassword(String password) {

		try {
			driver.findElement(passwordInputBox).clear();
			driver.findElement(passwordInputBox).sendKeys(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void clickSignInButton() {

		try {
			driver.findElement(signinButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static boolean errorMessagePresence() {
		
		boolean result = false;
		
		try {
			result = driver.findElement(errorMessage).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	public static boolean allProjectsTextPresence() {
		
		boolean result = false;
		
		try {
			result = driver.findElement(allProjectsText).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

}
