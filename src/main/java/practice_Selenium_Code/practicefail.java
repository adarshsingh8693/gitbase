package practice_Selenium_Code;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Zoo_View.generic.BaseClass;
@Listeners(com.Zoo_View.generic.ListernersImplemantion.class)
public class practicefail extends BaseClass{
	@Test
	public void test() {
		Assert.assertEquals(true, false);
	}

}
