package practice_package;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamas2 {
	
	@Test
	@Parameters({"URL","username","password"})
	public void t1_searchProduct(String URL,String username,String password) {
		System.out.println("open Browser");
		System.out.println("launch :"+URL);
		System.out.println("sign as username: "+username+" nd password"+password);
		System.out.println("search for ");
		System.out.println("sign out");
		System.out.println("close Browser");
		System.out.println("------------------------");
	}
	
	@Test
	@Parameters({"URL","username","password"})
	public void t2_addToWishList(@Optional("Google pixel")String product,String URL,String username,String password) {
		
		System.out.println("open Browser");
		System.out.println("launch :"+URL);
		System.out.println("sign as username: "+username+" nd password"+password);
		System.out.println("search for "+product);
		System.out.println("add to Wishlist");
		System.out.println("sign out");
		System.out.println("close Browser");
		System.out.println("------------------------");
	}

	@Test
	@Parameters({"URL","username","password"})
	public void t3_addToCart(String URL,String username,String password) {
		
		System.out.println("open Browser");
		System.out.println("launch :"+URL);
		System.out.println("sign as username: "+username+" nd password"+password);
	
		System.out.println("go to Wishlist");
		System.out.println("sign Out");
		System.out.println("sign out");
		System.out.println("close Browser");
		System.out.println("------------------------");
	}
}
