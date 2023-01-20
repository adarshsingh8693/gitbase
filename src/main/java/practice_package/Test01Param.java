package practice_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01Param extends DataProviderData {
	@Test(dataProvider = "getDatas")
	public void sumOfData(int x,int y,int res) {
		int result =x+y;
		Assert.assertEquals(result, res);
	}
 @Test(dataProvider="getDatas")
  public void testData(String name,int length)
  {
	 int len=name.length();
	 Assert.assertEquals(len, length);
  }
}
