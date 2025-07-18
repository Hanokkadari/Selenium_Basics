package Popuptasks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchElemenettask {

	public static void main(String[] args) {

		
	//launch the browser
	WebDriver driver=  new ChromeDriver();
				
    //maximize the window
	driver.manage().window().maximize();
				
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	//navigate to appln
	driver.get("https://www.ajio.com/?srsltid=AfmBOoqETnKwI_c8TiA8Ncx8IulhTNLWQ6-hy_M0XGwapX5OPVTMc0M6");
	
	

	
		
		
	}

}
