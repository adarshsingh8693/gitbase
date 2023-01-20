package practice_package;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamas {
	
	@Test
	@Parameters({"URL","username","password"})
	public void t1_searchProduct(String URL,String username,String password) {
		System.out.println("open Browser");
		System.out.println("launch :"+URL);
		System.out.println("sign as username: "+username+" nd password"+password);
		System.out.println("search for iphone x");
		System.out.println("sign out");
		System.out.println("close Browser");
		System.out.println("------------------------");
	}
	
	@Test
	@Parameters({"URL","username","password","product"})
	public void t2_addToWishList(String URL,String username,String password,String product) {
		
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
