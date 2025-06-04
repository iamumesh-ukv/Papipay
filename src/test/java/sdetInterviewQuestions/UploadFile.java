package sdetInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

	WebDriver driver;

	@Test()
	public void iniate()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chatgpt.com/");
	}
	@Test
	public void uploadFileMethod()
	{

	driver.findElement(By.xpath("//button[@aria-label='Upload files and more']//*[name()='svg']")).click();
	driver.findElement(By.xpath("//div[normalize-space()='Upload from computer']")).click();
	}
}
