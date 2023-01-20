package practice_package;

import org.testng.annotations.DataProvider;

public class TestDataProviderconst {
	
	public TestDataProviderconst(String name) {
		System.out.println("I am in TestDataProviderconst :"+name);
		
	}
	
	
	@DataProvider(name="data-provider")
	public static Object[][] getData(){
		return new Object[][] {
				{"tomsmith232","SuperSecretPassword!"},
				{"tomsmith2327","SuperSecretPassword!"},
				{"toms","SuperSec"}
		
		};
	}
}
