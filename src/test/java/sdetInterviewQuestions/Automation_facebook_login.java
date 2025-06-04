package sdetInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automation_facebook_login {
	
	WebDriver driver ;
	
	@BeforeTest()
	@Parameters("Browser")
	public void iniate(String browserName)
	{
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/login/");
//		driver.manage().window().maximize();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
	}
	@Test()
	public void login_Facebook()
	{
		
		driver.get("https://www.facebook.com/login/");
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("umesh@yopmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("Umesh@123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		loginButton.click();
	}
	@AfterTest()
	public void  tearDown() throws InterruptedException
	{
		if (driver != null)
		{
			Thread.sleep(500);
			driver.close();	
		}
	}
}
