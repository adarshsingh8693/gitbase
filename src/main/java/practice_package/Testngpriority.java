package practice_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngpriority {
	
	
	@Test(priority=1)
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
	}
	@Test(priority=0)
	public void launchBrowser() {
		Reporter.log("LaunchBrowser",true);
	}
	@Test(priority=2)
	public void login() {
		Reporter.log("Login",true);
	}
	@Test(priority=3)
	public void searchProduct() {
		Reporter.log("SearchProduct",true);
	}
	@Test(priority=4)
	public void addToCart() {
		Reporter.log("AddToCart",true);
	}
	@Test(priority=5)
	public void logOut() {
		Reporter.log("Logout",true);
	}
	@Test(enabled=false)//it will not excecute
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
	}
	//it will not excecute
	public void loseBrowser() {
		Reporter.log("loseBrowser",true);
	}

}
