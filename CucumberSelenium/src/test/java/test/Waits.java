package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); // on doit faire attention si la version de browser est la meme que mon browser 
			
		 WebDriver driver = new ChromeDriver();
		 // implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://google.com");
		 WebElement acceptButton = driver.findElement(By.id("L2AGLb"));
		 acceptButton.click();
		 driver.findElement(By.name("q")).sendKeys("Automation step by step" + Keys.ENTER);
	
	
	//driver.close();
	// driver.quit();
	}

}
