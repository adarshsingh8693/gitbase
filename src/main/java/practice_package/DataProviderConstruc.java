package practice_package;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderConstruc {

	
	
	public DataProviderConstruc() {
		System.out.println("Test of constructor");
	}
	

	@DataProvider
	public Object[][]  getDatas(Method method){
		
         /* switch(method.getName()) {
          
          case "sumOfData":
        	  return new Object[][] {
      			{3,5,8},
      			{5,6,11},
      			{2,5,7}
      			};
      			
          case "testData" :
        	  return new Object[][] {
        		  {"switch",6},
      			{"youtube",7},
      			{"AdarshNS",8},
      			{"Golu",4}
        	  };
          }*/
		return null;		
	}
}
