package Test;

/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
*/

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
		ChromeOptions Options= new ChromeOptions();
		Options.addArguments("--headless");
		WebDriver driver= new ChromeDriver(Options);
		driver.get("http://localhost:3001/");
		 
		driver.findElement(By.name("login")).sendKeys("devops");
		 
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("click")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String test= driver.findElement(By.name("test")).getText();
		assertEquals(test, "Login Succeeded");
		System.out.println("Test Succeeded!!");
		driver.quit();
		
/*
		// TODO Auto-generated method stub
		System.out.println("====Starting Java Program====");
		String projectlocation = System.getProperty("user.dir");
		System.out.println(projectlocation);
		System.setProperty("webdriver.gecko.driver","/home/edureka/eclipse-workspace/SeleniumTest/lib/geckodriver/geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		System.out.println("OpenDriver");
		driver2.manage().window().maximize();
		System.out.println("Maximize Window");

		driver2.get("http://www.google.com/");
		System.out.println("Connect to Google");

		System.out.println("=====End Java Program=====");
		
*/		
		
		
	}

	
	
	
	
}
