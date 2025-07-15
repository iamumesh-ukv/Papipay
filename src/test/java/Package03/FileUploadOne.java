package Package03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class FileUploadOne {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://enhancv.com/resources/resume-checker/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		// driver.findElement(By.xpath("//button[text()='Upload Your
		// Resume']")).sendKeys("C:\\Users\\umesh\\Downloads\\Umesh_qa.v1");

//		// Using java script Executor if type=file attribute is not available
		driver.findElement(By.xpath("//button[text()='Upload Your Resume']")).click();
//		WebElement button = driver.findElement(By.xpath("//button[text()='Upload Your Resume']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", button);

		/*
		 * 1) Copy the path 2)CTRL+V 3)Enter
		 */
		Robot rb = new Robot();
		rb.delay(300);

		// Put the file in Clip board
		StringSelection ss = new StringSelection("C:\\Users\\umesh\\Downloads\\Umesh_qa.v1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// CTR+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(3000);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		// driver.close();
	}
}
