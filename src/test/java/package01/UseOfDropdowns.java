package package01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseOfDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpcountry = driver.findElement(By.xpath("//select[@id='input-country']"));
		
 		Select selectItem = new Select(drpcountry);
//		selectItem.selectByIndex(5);
//		selectItem.selectByVisibleText("Angola");
//		selectItem.selectByValue(null);
		
		List<WebElement> allOptions = selectItem.getOptions();
		
		for(WebElement option: allOptions)
		{
			if(option.getText().equals("Albania"))
			{
				option.click();
			}
		}
		
		
		

	}

}
