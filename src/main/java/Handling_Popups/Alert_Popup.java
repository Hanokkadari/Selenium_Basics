package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver=  new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get appln
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
		
		WebElement res = driver.findElement(By.id("result"));
		
		System.out.println(res.getText());
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
