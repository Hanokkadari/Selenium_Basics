package TakeScreenshot_Method;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElementTakeScreenshot {

	public static void main(String[] args) throws IOException {
	
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
	WebElement ele =driver.findElement(By.xpath("//img[@title='Flipkart']"));
	
	
  File src = ele.getScreenshotAs(OutputType.FILE);
  
  File dest=new File("./Webelement/FK_Icon.png");
  
  FileUtils.copyFile(src, dest);
  
  
  driver.quit();
  
  
  
  
	
		
	
	
		
		

	}

}
