package sdetInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Dropdown {

	public void initializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");

		WebElement noofempl = driver.findElement(By.xpath(""));
		seleectOptionFromDropdown(noofempl , "20-30");

		WebElement industryElem = driver.findElement(By.xpath(""));
		seleectOptionFromDropdown(industryElem , "Healthcare");

		WebElement country = driver.findElement(By.xpath(""));
		seleectOptionFromDropdown(country , "india");
	}



	//Ganeric method/ user define method to select value from dropdown
	public static void seleectOptionFromDropdown(WebElement elem, String value)
	{
		Select drp = new Select(elem);

		List<WebElement> allOptions=drp.getOptions();

		for(WebElement option:allOptions)
		{
			if(option.getText().equals("abc"))
			{
				option.click();
				break;	
			}
		}
	}
}
