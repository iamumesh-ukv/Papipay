package package02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownBySelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		WebElement element =driver.findElement(By.xpath("//select[@id='Form_getForm_Country']//option"));
		Select drpdown = new Select(element);
		drpdown.selectByIndex(5);
		
		

	}

}
