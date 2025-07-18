package TestNg;

import org.testng.annotations.Test;

public class Using_Enabled {
	
	
	@Test(enabled=true,groups="smoke")
	public void manual() {
		System.out.println("Manual");
	}
	
	@Test(enabled=false,groups="regression")
	public void selenium() {
		System.out.println("Selenium");
	}
	
	
	
	

}
