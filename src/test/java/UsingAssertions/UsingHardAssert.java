package UsingAssertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {
	
	
	@Test
	public void Scenario() throws InterruptedException
	
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//validate the ttile of the webpage
		
	String title = driver.getTitle();
	
	
	String expTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	Assert.assertEquals(title, expTitle);
	
	Assert.assertTrue(title.contains(expTitle));
	
	Assert.assertNotNull(expTitle);
	
//	Assert.fail();
	
	
	driver.quit();
		
		
		
		
	}
	
	
	
	
	

}
