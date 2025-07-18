package TakeScreenshot_Method;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import org.openqa.selenium.devtools.v131.filesystem.model.File;
import java.io.File;
import java.io.IOException;

public class UsingTakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	//launch the browser	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src= ts.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./Screenshot/Flipkart.png");
	
	//FileHandler.copy(src, dest);
	
	//org.apache.commons.io.FileUtils.copyFile(src, dest);
	FileUtils.copyFile(src, dest);
	
	
	
	
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

	private static void FileUtils(File src, File dest) {
		// TODO Auto-generated method stub
		
	}

}
