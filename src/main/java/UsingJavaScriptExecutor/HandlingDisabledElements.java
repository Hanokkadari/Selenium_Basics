package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Admin/Desktop/SELINIUM/Samplewebpage.html");
		
		
		WebElement un_TF = driver.findElement(By.id("user"));
		
		//launching disabled TF
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",un_TF,"selenium");
		
		
		
		//handle disable button
		WebElement login = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].disabled=false",login);
		login.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		

	}

}
