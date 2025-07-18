package Popuptasks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Mutliple_popups {

	public static void main(String[] args) throws InterruptedException {
	
		
       //launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to an appln
		driver.get("https://shoppersstack.com/");
		
		//create an object of action class
		Actions act =new Actions(driver);
		
		//identify the menu click on it
		
		WebElement kidsMenu = driver.findElement(By.xpath("//a[text()='Kids']"));
		act.moveToElement(kidsMenu).perform();
		
		Thread.sleep(3000);
		
		//click on t-shirts
		driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		
		//click on first element 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='us polo kids']")).click();
		
		Thread.sleep(3000);
		
		//get parent window id
		String pwid = driver.getWindowHandle();
		
		//click on description
		driver.findElement(By.xpath("//*[name()='svg'][@class=\"MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj\"]")).click();
		
		Thread.sleep(3000);
		//switvh to driver control to amazon
		Set<String> wids = driver.getWindowHandles();
		for(String s:wids) {
			driver.switchTo().window(s);
			String url=driver.getCurrentUrl();
			
			if(url.contains("https://wwww.amazon.in/")) {
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
			
		
		

	}

}
