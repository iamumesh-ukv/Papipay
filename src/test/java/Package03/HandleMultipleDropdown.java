package Package03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HandleMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelistproperty.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement inquiryType = driver.findElement(By.name("enquiry_type"));
		Selectoptionfromdropdwon(inquiryType, "Evaluation");

		WebElement information = driver.findElement(By.name("user_type"));
		Selectoptionfromdropdwon(information, "I'm A Seller");
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.name("e_meta[city]"));
		Selectoptionfromdropdwon(city, "Delhi");
	}

	public static void Selectoptionfromdropdwon(WebElement findelement, String value) {
		Select dropdown = new Select(findelement);
		List<WebElement> allOptions = dropdown.getOptions();
		for (WebElement option : allOptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
}
