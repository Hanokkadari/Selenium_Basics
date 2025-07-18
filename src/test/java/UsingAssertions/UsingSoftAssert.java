package UsingAssertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {
	
	
	@Test
	public void scenario_SA()
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		String acturl = driver.getCurrentUrl();	
	String expurl="https://www.facebook.com/";
	
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(acturl, expurl);
		
		
		driver.quit();
		
		
		soft.assertAll();
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
