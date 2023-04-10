package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserFormerPage {
	protected WebDriver driver;
	private By btn_logout = By.id("logout");
	
	public UserFormerPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void checkLogoutIsDisplayed(){
		driver.findElement(btn_logout).isDisplayed();	
	}
	
}


