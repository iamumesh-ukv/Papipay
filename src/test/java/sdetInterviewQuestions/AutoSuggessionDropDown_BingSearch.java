package sdetInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessionDropDown_BingSearch {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q"));
		
		
		
	}

}
