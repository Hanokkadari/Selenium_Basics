package Popuptasks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajiooootask {

	public static void main(String[] args) {
	

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ajio.com/");
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
