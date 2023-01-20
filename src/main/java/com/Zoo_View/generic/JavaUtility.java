 package com.Zoo_View.generic;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNo()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		return random;
	}
	public String getSystemDate() {
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date systemdate=new Date();
		String getDateAndTime = dateformat.format(systemdate); 
		
		return getDateAndTime.replaceAll(":", "-");
	}

}
