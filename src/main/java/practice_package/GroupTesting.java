package practice_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTesting {
	
	@Test(groups= {"sanity"})
	public void Test01() {
		Reporter.log("I m In Test-01)",true);
	}
	@Test(groups= {"smoke"})
	public void Test02() {
		Reporter.log("I m In Test-02)",true);
	}
	@Test(groups= {"sanity","smoke"})
	public void Test03() {
		Reporter.log("I m In Test-03)",true);
	}
	@Test(groups= {"smoke"})
	public void Test04() {
		Reporter.log("I m In Test-04)",true);
	}
	@Test
	public void Test05() {
		Reporter.log("I m In Test-05)",true);
	}
	
	

}
