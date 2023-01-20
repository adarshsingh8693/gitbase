package practice_package;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationByMadam {
	@BeforeSuite
	public void connDataBase() {
		Reporter.log("connect to database",true);
	}

	@AfterSuite
	public void closDataBase() {
		Reporter.log("close to database",true);
	}
    
	@BeforeClass
	public void launchBrow() {
		Reporter.log("launch the browser", true);
	}
	
	@AfterClass
	public void closeBrow() {
		Reporter.log("Close the browser", true);
	}
	
	@BeforeMethod
	public void logIn() {
		Reporter.log("login to application", true);
	}
	
	@AfterMethod
	public void logOut() {
		Reporter.log("logout to Application", true);
	}
	
	@Test
	public void testScript() {
		Reporter.log("Run your TestScript", true);
	}
	@Test
	public void testScript02() {
		Reporter.log("Run ur another testscript", true);
	}
	
}
