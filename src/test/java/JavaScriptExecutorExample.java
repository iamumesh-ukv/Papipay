

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import interviewQuestions.JavaScriptUtil;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method 

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript(script, args);
		
		//Flash
		  WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		  JavaScriptUtil.flash(logo, driver);
		
		

	}

}
