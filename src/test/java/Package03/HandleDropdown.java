package Package03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://freelistproperty.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='form-field-b01b4cd']"));
		Select drpdown = new Select(dropdown);
		// drpdown.selectByIndex(2);
		// drpdown.selectByValue("delhi");
		// drpdown.selectByVisibleText("3");

		List<WebElement> allOption = drpdown.getOptions();
		for (WebElement option : allOption) {
			if (option.getText().equals("Noida")) {
				option.click();
				break;
			}
		}
	}
}
