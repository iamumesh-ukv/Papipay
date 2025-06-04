package sdetInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIFrame {
	
	//driver.switchTo().frame(name of the frame/id of the frame)
	//driver.switchTo().frame(WebElement)
	//driver.switchTo().frame(0)
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Handle Iframe by using Iframe or by id
		/*driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='java.applet']")).click();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='AppletContext']")).click();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Description")).click(); */
		
		//Handle iframe using WebElement
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.linkText("Home")).click();
		
	}

}
