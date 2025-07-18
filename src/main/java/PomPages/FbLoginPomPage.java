
	
		
		package PomPages;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		public class FbLoginPomPage {

			//Declaration
			@FindBy(xpath="//h2")
			private WebElement header;
			
			@FindBy(id="email")
			private WebElement un;
			
			@FindBy(id="pass")
			private WebElement pswd;
			
			@FindBy(name="login")
			private WebElement loginbtn;
			
			//initialization

			public FbLoginPomPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				
					}
			//utilization

			public WebElement getHeader() {
				return header;
			}

			public WebElement getUn() {
				return un;
			}

			public WebElement getPswd() {
				return pswd;
			}

			public WebElement getLoginbtn() {
				return loginbtn;
			}
			
			

			
			
			
			

		
		
		
		
		
		
		

	}


