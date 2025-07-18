package Handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handling_FileUpload_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      
//	      driver.get("https://the-internet.herokuapp.com/upload");
	      
	      StringSelection str=new StringSelection("‪Desktop\\selenium.docx");
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	      
	      
	      driver.get("https://the-internet.herokuapp.com/upload");
	      
	      
	      WebElement upload = driver.findElement(By.id("file-upload"));
	      
	      
	      Actions act= new Actions(driver);
	      act.moveToElement(upload).click(upload).build().perform();
	      
	      Thread.sleep(3000);
	      
	      Robot r= new Robot();
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      
	      Thread.sleep(3000);
	      
	      driver.quit();
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      

	}

}
