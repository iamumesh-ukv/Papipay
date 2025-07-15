package new_package_facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_LoginPage {

	WebDriver driver;

	// Objects
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailAddressField;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@id='loginbutton']")
	WebElement loginButton;

	// Actions Method

	public FB_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmailAddress(String emailText) {

		emailAddressField.sendKeys(emailText);

	}

	public void enterPassword(String passwordText) {

		passwordField.sendKeys(passwordText);

	}

	public void clickOnLoginbutton() {
		loginButton.click();
	}
}
