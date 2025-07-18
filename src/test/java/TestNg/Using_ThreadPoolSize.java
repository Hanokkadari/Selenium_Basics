package TestNg;

import org.testng.annotations.Test;

public class Using_ThreadPoolSize {
	
	
	@Test(priority = 2,groups="smoke")
	public void Login() {
		System.out.println("Login");
		
	}

	
	@Test (priority = 1,groups="regression")
	public void register() {
		System.out.println("Register");
			
	
	}
	
	
	
	
	
		@Test(priority = 3,threadPoolSize=3,invocationCount=3)
		public void create() {
			System.out.println("Create");
				
		
		
		
		
		
		
		
		
	}
	
	
	

}
