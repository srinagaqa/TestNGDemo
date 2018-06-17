package Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceTest {
	
	public WebDriver cDriver;
	public String browserDriver = "webdriver.chrome.driver";
	public String driverPath = "C:\\Selenium\\chromedriver.exe";
	
	@BeforeSuite
	public void setupDriver()
	{
		
		System.setProperty(browserDriver, driverPath);
		cDriver = new  ChromeDriver();
		
		cDriver.get("https://login.salesforce.com/?locale=ca");
		
	}
	
	@Test
	public void salesForceInvalidLogin()
	{
		
		
		WebElement userName = cDriver.findElement(By.id("username"));
		WebElement password = cDriver.findElement(By.name("pw"));
		WebElement loginButton= cDriver.findElement(By.xpath("//input[@id='Login']"));
		
		userName.sendKeys("sri");
		password.sendKeys("1234");
		loginButton.click();
		WebElement errorMsg= cDriver.findElement(By.xpath("//div[@id='error']"));
	    Assert.assertEquals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.", errorMsg.getText());
			
			
	}
	
	@Test
	public void salesForceValidLogin()
	{
		
		WebElement userName = cDriver.findElement(By.id("username"));
		WebElement password = cDriver.findElement(By.name("pw"));
		WebElement loginButton= cDriver.findElement(By.xpath("//input[@id='Login']"));
		userName.sendKeys("priya");
		password.sendKeys("1234");
		loginButton.click();
			
			
	}
	
	/*@AfterTest
	public void closeBrowser()
	{
		cDriver.close();
	}*/
}
