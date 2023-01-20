package practice_package;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderPrac {
	/*@Test(dataProvider = "data-provider")
	public void sum(int x,int y,int res) {
		int rest=x+y;
		Assert.assertEquals(rest, res);
	}
	@DataProvider(name="data-provider")
	public Object[][] getData(){
		return new Object[][] {
			{3,5,8},
			{5,6,11},
			{2,5,7}
			};*/
		
			/*@Test(dataProvider = "getDat")
			public void sum(float xx,float yy,float res) {
				float rest=xx+yy;
				Assert.assertEquals(rest, res);
			}
			@DataProvider
			public Object[][] getDat(){
				return new Object[][] {
					{3,5,8},
					{5,6,11},
					{2,5,7}
					};		
			
			}*/
	
	@Test(dataProvider = "getDatas")
	public void sum(float xx,float yy,float res) {
		float rest=xx+yy;
		Assert.assertEquals(rest, res);
	}
	@Test(dataProvider = "getDatas")
	public void testlength(String name,int count) {
		int result=name.length();
		Assert.assertEquals(result,count);
		
	}
	/*@DataProvider
	public Object[][] getDat(){
		return new Object[][] {
			{3,5,8},
			{5,6,11},
			{2,5,7}
			};		
	
	}
	
	@DataProvider
	public Object[][] get(){
		return new Object[][] {
			{"switch",6},
			{"youtube",7},
			{"AdarshNS",8}
			};		
	
	}*/
	@DataProvider
	public Object[][]  getDatas(String method){
		
         /* switch(method ) {
          case "sum":
        	  return new Object[][] {
      			{3,5,8},
      			{5,6,11},
      			{2,5,7}
      			};
      			
          case "testlength" :
        	  return new Object[][] {
        		  {"switch",6},
      			{"youtube",7},
      			{"AdarshNS",8}  
        	  };
          }*/
		return null;		
	}
	
}
