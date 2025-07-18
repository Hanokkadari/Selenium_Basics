package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_GettersMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement login = driver.findElement(By.linkText("Log in"));

		
		//fetch the text present on the element
		
		
		System.out.println("text:--"+login.getText());
		
		System.out.println("tagname:--"+login.getTagName());
		
		System.out.println("get attribute:--"+login.getDomAttribute("class"));
		
		Dimension size = login.getSize();
		System.out.println("size:---"+size);
	    System.out.println("width:-- "+size.getWidth());
		System.out.println("height:--"+size.getHeight());
	    
	    
		Point loca = login.getLocation();
		System.out.println("location:--"+loca);
		System.out.println("X Axis:--"+loca.getX());
		System.out.println("Y-axis:--l"+loca.getY());
		
		Rectangle rec = login.getRect();
		System.out.println("get rect:--"+rec);
		System.out.println("width:-- "+rec.getWidth());
		System.out.println("height:--"+rec.getHeight());
		System.out.println("X Axis:--"+rec.getX());
		System.out.println("Y-axis:--l"+rec.getY());
		
		
		String color = login.getCssValue("padding-left");		
		System.out.println("cssvalue:--"+color);
		driver.quit();
	}

}
