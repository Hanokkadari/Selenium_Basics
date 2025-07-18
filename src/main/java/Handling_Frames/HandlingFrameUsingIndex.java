package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://the-internet.herokuapp.com/iframe");
		
		 driver.switchTo().frame(0);
		 
		 String text = driver.findElement(By.xpath("//p")).getText();
		 
		 System.out.println(text);
		 
		 
		 
		 
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("//span[text()='Paragraph']"));
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		 
		 
		 
		
		
	}

}
