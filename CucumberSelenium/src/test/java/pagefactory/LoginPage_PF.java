package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	// locators 
	@FindBy(id = "name" )
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;

	// constructor to initialize or to pass webdervier

	WebDriver driver;  
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
	  //  PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	// actions 
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}


	public void clicOnLogin() {
		btn_login.click();
	}

}
