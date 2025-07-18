package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathOperator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[@data-testid='royal-email' and contains(@placeholder, 'Email')]")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@data-testid='royass' or @type='password']")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//button[@name='lo' or text()='Log in']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
