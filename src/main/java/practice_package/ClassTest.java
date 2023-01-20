package practice_package;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTest {

	/*@Test(dataProvider = "getDatas")
	public void sum(float xx,float yy,float res) {
		float rest=xx+yy;
		Assert.assertEquals(rest, res);
	}*/
	
	@DataProvider
	public Object[][]  getDatas( ){
		
          
        	  return new Object[][] {
      			{3,5,8},
      			{5,6,11},
      			{2,5,7}
      			};
}
}