package TestNg;

import org.testng.annotations.Test;

public class Using_DependsOnMethod {

	
	@Test(dependsOnMethods="register",groups="smoke")
	public void Login() {
		System.out.println("Login");
		
	}

	
	@Test (groups="regression")
	public void register() {
		System.out.println("Register");
			
	
	}
	
	
	
	
	
		@Test(dependsOnMethods="login")
		public void create() {
			System.out.println("Create");
				
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
