package new_package_facebooklogin;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersPro.class)

public class FB_LoginTest extends ListenersPro {
	
	@Test(retryAnalyzer = new_package_facebooklogin.ReTryClass.class)
	
	public void loginTest()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FB_LoginPage lp = new FB_LoginPage(driver);
		lp.enterEmailAddress("umesh@yopmail.com");
		lp.enterPassword("Umesh@123");
		lp.clickOnLoginbutton();
		
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
		
	}

	
	
}
