package Task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bookmyshow {
	
@Test(groups = "smoke")
	
	public void bookmyshow() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://in.bookmyshow.com/");
		
		Thread.sleep(3000);
		
		Reporter.log("bookmyshow",true);
		
		driver.quit(); 
		
		
		
}		
}