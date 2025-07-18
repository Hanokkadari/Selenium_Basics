package Popuptasks;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.filesystem.model.File;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_on_Child_WindowHandles {

	public static void main(String[] args) throws InterruptedException, IOException { {
		
		
				
				//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Thread.sleep(2000);
				
				//Navigate to an application
				driver.get("https://www.shoppersstack.com/");
				
				//Fetch the parent window id
			    String	pwid=driver.getWindowHandle();
			   
				//Thread.sleep(3000);
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("kids")));
				
				//Mouse over on an element
				WebElement kids = driver.findElement(By.id("kids"));
				Actions act=new Actions(driver);
				act.moveToElement(kids).build().perform();
				Thread.sleep(3000);
				
				//After mouse overing Click on any one of the Categories
				driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
				Thread.sleep(3000);
				
				//Select the product name and click on it
//				WebElement ele= driver.findElement(By.xpath("//div[contains(@class,'MuiPaper-root')]"));
//				
//				Actions act1=new Actions(driver);
//				act1.moveToElement(ele).build().perform();
				//click on uspolo product
				WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='us polo kids ']")));
			    driver.findElement(By.xpath("//span[text()='us polo kids ']")).click();
			    Thread.sleep(3000);
			    
			    //click on compare icon
			    driver.findElement(By.xpath("//button[@name='compare']")).click();
			    Thread.sleep(2000);
			    //after click on compare icon it will open 3 child window switch to amazon child window
			   Set<String> wids = driver.getWindowHandles();
			    System.out.println("All wids::-"+wids);
			    
			    for(String s:wids) {
			    	//switch to window
			    	driver.switchTo().window(s);
			    	//check whether actual Url and expected url are same, if they are same then maximize amazon
			    	if(driver.getCurrentUrl().contains("https://www.amazon.in/")) {
			    		//maximize the amazon child window
			    		driver.manage().window().maximize();
			    		
			    		//takes screenshot of amazon child window after maximize
			    		
			    		//takes screenshot of amazon child window after maximize
			    		TakesScreenshot ts=(TakesScreenshot)driver;
			    	java.io.File src=ts.getScreenshotAs(OutputType.FILE);
			    java.io.File dest=new java.io.File("./screenshot/amazon.png");
			    FileUtils.copyFile(src, dest);
			    		
			    		
			    	}
			    }
			    //switch to parent window
			    driver.switchTo().window(pwid);
			    Thread.sleep(3000);
			    //close all the windows
			     driver.quit();    
			    
			}

		}
	
}
			    		
			    		
	    		
			    		
			    		
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	


