package Using_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//import net.bytebuddy.implementation.FieldAccessor.FieldLocation.Relative;

public class Using_NearMethod {
 public static void main(String[] args) {
	
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.flipkart.com/");
	 
	 WebElement element = driver.findElement(By.name("//input[@name='q']"));
	 
	driver.findElement(RelativeLocator.with(By.tagName("input")).near(element)).click();
	
	WebElement element1 = driver.findElement(By.name("//input[@name='q']"));
   driver.findElement(RelativeLocator.with(By.tagName("div")).near(element1)).click();
}
}

