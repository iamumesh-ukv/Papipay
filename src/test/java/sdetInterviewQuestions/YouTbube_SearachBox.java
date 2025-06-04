package sdetInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTbube_SearachBox {
	
	@Test()
	public void youTubeSearchBox()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");	
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
		searchBox.sendKeys(" Automation mock interview");
		driver.findElement(By.xpath("//button[@title='Search']//yt-icon")).click();
				
	}

}
