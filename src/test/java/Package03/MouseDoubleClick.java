package Package03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class MouseDoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/category/events/mouse-events/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//a[normalize-space()='dblclick event']"));
		Actions action = new Actions(driver);
		action.doubleClick(button).perform();
				
			

	}

}
