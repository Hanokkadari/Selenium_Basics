package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		
		//HANDLE SCROOL BAR USING  hardCODED COORDINATES
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1000)");
		
		//Element coordinates
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile"+Keys.ENTER);
		
		//element coordinates
		//WebElement camera = driver.findElement(By.xpath("//span[text()='Camera Modes']"));
		WebElement camera1 = driver.findElement(By.xpath("//span[text()='Camera Modes']"));
		int x_axis=camera1.getLocation().getX();
		int y_axis=camera1.getLocation().getY();
		js.executeScript("window.scrollBy("+x_axis+","+y_axis+")");
		
		//element reference
		WebElement ele = driver.findElement(By.xpath("//span[text()='Availability']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(2000);
		

		//scroll till bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroo till top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(3000);
		driver.quit();
	}

}	  
		  

