package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;




public class FirstTest {
	
 public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriverManager.chromedriver().setup(); // on doit faire attention si la version de browser est la meme que mon browser 
	// si je veux une version spesific 
    // WebDriverManager.chromedriver().driverVersion("110.0.5481.77").setup();
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     WebDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	driver.get("https://google.com"); //open browser with google 
	
	//driver.close(); // close the browser
	
}
}
