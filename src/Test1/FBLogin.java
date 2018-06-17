package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBLogin {
	
public WebDriver cDriver;

	
	@BeforeMethod
	public void setupDriver()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		cDriver = new ChromeDriver();
		cDriver.get("http://www.facebook.com");
	}
		
	
	
  @Parameters ({"username", "password"})
  @Test
  public void validLogin(String uname, String pswd) throws InterruptedException {
	  
	
		System.out.println(cDriver.getTitle());
		cDriver.findElement(By.id("email")).sendKeys(uname);
		cDriver.findElement(By.name("pass")).sendKeys(pswd);
		System.out.println("before click");
		cDriver.findElement(By.id("loginbutton")).click();
		System.out.println("after click");
	  
	  
  }
  
  @Parameters ({"username", "password"})
  @Test
  public void invalidLogin(String uname, String pswd) throws InterruptedException {
	  
	
		System.out.println(cDriver.getTitle());
		cDriver.findElement(By.id("email")).sendKeys(uname);
		cDriver.findElement(By.name("pass")).sendKeys(pswd);
		System.out.println(uname);
		cDriver.findElement(By.id("loginbutton")).click();
		System.out.println("after click inv");
	  
	  
  }
}
