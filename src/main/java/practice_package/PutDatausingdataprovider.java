package practice_package;

import org.testng.annotations.DataProvider;

public class PutDatausingdataprovider {

	
	public Object[][] setDat(){
		Object ob[][]= {
				   {105,"Name","Job"},
				   {101,"Adarsh","Software"},
				   {102,"ashish","Softwaredev"}
	};
	return ob;	
	}
}
