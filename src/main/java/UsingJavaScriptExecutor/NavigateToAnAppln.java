package UsingJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnAppln {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//navigate to an appln
		
		
		js.executeScript("window.location=arguments[0]", url);
		
		Thread.sleep(3000);
		
		
		//fetch the url and title
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(3000);
		
		//REFRESH THE WEB PAGE
		js.executeScript("history.go(0)");
		
		Thread.sleep(3000);
		
		
		
		
		driver.quit();
		
		
		
		
	}

}
