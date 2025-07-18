package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_FrameUsingId {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
			
		//maxmize the window
			driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//enter into frame
		driver.switchTo().frame("auth-login-ui");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		
		
		Thread.sleep(3000);
		
		
		
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
