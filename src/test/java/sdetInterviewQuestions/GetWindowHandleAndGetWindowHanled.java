package sdetInterviewQuestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandleAndGetWindowHanled {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
			//Write code here
		String  firstWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popuo window")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) 
		{
		String window = itr.next();
		driver.switchTo().window(window);
		if(driver.getTitle().equals("Basic Web Page Title"))
		{
			driver.close();
		}
		}
	}
}