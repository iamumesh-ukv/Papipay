package sdetInterviewQuestions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindow_HandleAnd_Handles {
	
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		WebElement webElement= driver.findElement(By.xpath("//span[.='Sign in with Google']"));
		webElement.click();
		String parantid = driver.getWindowHandle();
		System.out.println(parantid);
		
		
		Set<String> parantChildId = driver.getWindowHandles();
		System.out.println(parantChildId);
		
	}
	

}
