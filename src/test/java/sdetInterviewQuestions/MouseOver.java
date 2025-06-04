package sdetInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(20);
		WebElement desktopmenu=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
		WebElement macmenuItem=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(desktopmenu).moveToElement(macmenuItem);

	}

}
