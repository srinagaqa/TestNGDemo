package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {
	
	
	public WebDriver cDriver;

	
	@BeforeMethod
	public void setupDriver()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		cDriver = new ChromeDriver();
		cDriver.get("http://www.google.com");
		System.out.println("Test");
		
	}
 
	
	@Test
  public void SearchHelloWorld() {
	  
		//WebDriver FFdriver = new FirefoxDriver();
		
		WebElement searchField = cDriver.findElement(By.xpath("//*[@id='lst-ib']"));
		searchField.sendKeys("Hello World");
		searchField.sendKeys(Keys.RETURN);
		
	

  }
	
	@Test
	  public void SearchAutomation() {
		  
			//WebDriver FFdriver = new FirefoxDriver();
	
			WebElement searchField2 = cDriver.findElement(By.cssSelector("#lst-ib"));
			searchField2.sendKeys("Automation");
			searchField2.sendKeys(Keys.RETURN);
	  }	
	
	
	
}
