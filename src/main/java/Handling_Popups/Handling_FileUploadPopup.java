package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("https://the-internet.herokuapp.com/upload");
		
	      driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Downloads\\no-experience-resume.docx");
	      
	      Thread.sleep(3000);
	      
	      driver.quit();
	      
	      
		
		

	}

}
