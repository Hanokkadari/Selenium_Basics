package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("_55rl")).sendKeys("selenium");
		driver.findElement(By.className("_9npi")).sendKeys("abc123");
		driver.findElement(By.className("_42ft")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		

	}

}
