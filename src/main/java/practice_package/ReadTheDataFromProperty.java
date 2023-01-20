package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTheDataFromProperty {

	public static void main(String[] args) throws IOException {
      
		FileInputStream fis=new FileInputStream("./src/test/resources/commanData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Url = pobj.getProperty("url");
		String Browser = pobj.getProperty("browser");
		String User= pobj.getProperty("username");
		String Password= pobj.getProperty("password");
		System.out.println(Url+" "+Browser+" "+User+" "+Password);
		
	}

}
