package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.UserFormerPage;
import POM.loginPage;
import io.cucumber.java.en.*;

public class LoginDemoSteps_POM {

//
//	WebDriver driver = new ChromeDriver();
//	loginPage login = new loginPage(driver);
//	UserFormerPage userFormer = new UserFormerPage(driver);
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is:" +projectPath);
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//		//WebDriver driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//	}
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		driver.navigate().to("https://example.testproject.io/web/");
//
//	}
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//      
//		login.enterUsername(username);
//		login.enterPassword(password);
//		Thread.sleep(2000);
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		login.clickLogin();
//		Thread.sleep(2000);
//	}
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//
//		userFormer.checkLogoutIsDisplayed();
//	}




}
