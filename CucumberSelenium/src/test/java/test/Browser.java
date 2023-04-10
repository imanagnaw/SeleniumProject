package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static void main(String[] args) throws InterruptedException, IOException {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriverManager.chromedriver().setup(); // on doit faire attention si la version de browser est la meme que mon browser 
	// si je veux une version spesific 
   // WebDriverManager.chromedriver().driverVersion("110.0.5481.77").setup();
    WebDriver driver = new ChromeDriver();
    
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	driver.get("https://google.com"); //open browser with google 
	String originalWindow = driver.getWindowHandle();
	driver.navigate().to("https://automationstepbystep.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	// not recomanded to use in our project but here just
	// to see 
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	driver.switchTo().newWindow(WindowType.WINDOW); // create new window
	driver.switchTo().newWindow(WindowType.TAB);// create new page in same fenetre
	driver.switchTo().window(originalWindow); // if we have several windows and we want switch between windows
	
	driver.manage().window().getSize().getWidth();
	driver.manage().window().getSize().getHeight();
	Dimension size = driver.manage().window().getSize();
	System.out.println(size.getWidth());
	System.out.println(size.getHeight());
	
	driver.manage().window().setSize(new Dimension(800,600));
	
	driver.manage().window().getPosition().getX();
	driver.manage().window().getPosition().getY();
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("./image.png"));
	Thread.sleep(3000);
	//driver.close(); // close the current window or tab 
	driver.quit();// close all the complete browser session

	
}
}
