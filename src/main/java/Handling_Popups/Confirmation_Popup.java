package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
		
		
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
		
		WebElement res = driver.findElement(By.id("result"));
		
       System.out.println(res.getText());
		
		driver.quit();
		

		
		
		
		
		
		
		
		

	}

}
