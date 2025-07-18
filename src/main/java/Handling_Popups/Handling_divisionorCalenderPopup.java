package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_divisionorCalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		

        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		
		
		
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hyd");
		
		
		
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("blr");
		
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(3000);
		
	
		
		driver.findElement(By.xpath("//div[contains(text(),'June')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='27']")).click();
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
