package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	protected WebDriver driver;
	private By txt_username_log = By.id("name");
	private By txt_password = By.id("password");
	private By btn_login = By.id("login");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
//		if(!driver.getTitle().equals("TestProject Demo")) {
//			throw new IllegalStateException("This is not login Page. The current page is "
//		+driver.getCurrentUrl());
//		}
	}
	public void enterUsername(String username){
		driver.findElement(txt_username_log).sendKeys(username);	
	}
	
	public void enterPassword(String password){
		driver.findElement(txt_password).sendKeys(password);
	}
    
	public void clickLogin(){
		driver.findElement(btn_login).click();
	}
	
	public void loginValidUser(String username, String password) {
		enterUsername(username);
		 enterPassword(password);
		 clickLogin();
		
	}
}
