package Popuptasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajiotask {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ajio.com/");
		
		Actions act=new Actions(driver);
		
		
		
		
		WebElement  men = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		act.moveToElement(men).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
