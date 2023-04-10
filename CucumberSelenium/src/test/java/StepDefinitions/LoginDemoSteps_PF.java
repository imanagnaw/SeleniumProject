package StepDefinitions;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.LoginPage_PF;
import pagefactory.UserFormerPage_PF;

public class LoginDemoSteps_PF {


	
	ChromeOptions optionChrome = new ChromeOptions();


	//WebDriver driver = new ChromeDriver(optionChrome);
	WebDriver driver;
	
	LoginPage_PF login = new LoginPage_PF(driver);
	UserFormerPage_PF userformer = new UserFormerPage_PF(driver);
	

	@Given("browser is open")
	public void browser_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" +projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		optionChrome.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(optionChrome);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		optionChrome.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(optionChrome);
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);
	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {

		login.enterUsername(username);
		login.enterPassword(password);

		Thread.sleep(2000);
	}
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
  
		login.clicOnLogin();
		
		Thread.sleep(2000);
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		userformer.checkLogoutIsDisplayed();;
	}




}
