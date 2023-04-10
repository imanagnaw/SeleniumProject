package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserFormerPage_PF {

	// locators 
	@FindBy(id = "logout" )
	WebElement btn_logout;

	// constructor to initialize or to pass webdervier

	WebDriver driver;  

	public UserFormerPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   // actions 
	
	public void checkLogoutIsDisplayed(){
		btn_logout.isDisplayed();	
	}

}


