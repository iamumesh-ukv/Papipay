package Package03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetButtonColor {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(200);
		WebElement buttonColor = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		String s1 =buttonColor.getCssValue("background-color");
		System.out.println(s1);
		driver.close();

	}

}
