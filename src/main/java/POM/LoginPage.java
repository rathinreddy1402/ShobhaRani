package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	private WebElement UserTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(id="loginButton")
	private WebElement submitButton;

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public void loginToApp(String username, String password)
	{
		UserTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		submitButton.click();
		
	}
	
	
}
