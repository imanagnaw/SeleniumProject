package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriverManager.chromedriver().setup(); // on doit faire attention si la version de browser est la meme que mon browser 
		// si je veux une version spesific 
	    // WebDriverManager.chromedriver().driverVersion("110.0.5481.77").setup();
	     WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://google.com"); //open browser with google 
		WebElement acceptButton = driver.findElement(By.id("L2AGLb"));
		acceptButton.click();
		// driver.close(); // close the browser
		WebElement searchBox =  driver.findElement(By.name("q"));
		searchBox.sendKeys("ABCD", Keys.ENTER);
		Thread.sleep(2000);
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element: options) {
			System.out.println(element.getText());
		}
		
		driver.findElement(By.cssSelector("#fname")).sendKeys("Imane");
		Thread.sleep(2000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("ABCD");
		
		Thread.sleep(3000);
		//driver.close(); 
		//driver.quit(); 
	}
}
