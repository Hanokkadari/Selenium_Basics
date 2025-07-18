package TestNg;

import org.openqa.selenium.internal.Debug;
import org.testng.annotations.Test;


public class UsingPriorityFlag {

	@Test(priority=2,groups="smoke")
	public void Login() {
		System.out.println("Login");
		
		
	}
	
	@Test(priority=1,groups="regression")
	public void register() {
		System.out.println("Register");
	}
	
	@Test(priority=3)
	public void create() {
		System.out.print("Create");
		
	}
	
	
	
	
}
