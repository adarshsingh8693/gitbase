  package practice_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.XLSBUnsupportedException;
import org.apache.poi.xssf.eventusermodel.XSSFBReader;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Zoo_View.generic.IPathConstants;
import com.mysql.cj.result.Row;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData{
	
	public static void main(String []args) throws InterruptedException, IOException, Exception {
		System.out.println("hgjh");
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//*[@id='customers']//tr[2]//td[1]
		//*[@id='customers']//tr[3]//td[1]
		//*[@id='customers']//tr[4]//td[1]
		//*[@id='customers']//tr[7]//td[1]
		Xl
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String beforeXpath_company="//*[@id='customers']//tr[";
		String afterXpath_company="]//td[1]";
		
		String beforeXpath_contact="//*[@id='customers']//tr[";
		String afterXpath_contact="]//td[2]";
		for(int i=2;i<=7;i++) {
			Thread.sleep(100);
			String actual_xpathcompany=beforeXpath_company+i+afterXpath_company;
			String companyName = driver.findElement(By.xpath(actual_xpathcompany)).getText();
			System.out.println(companyName);
			
			String actual_xpathcontact=beforeXpath_contact+i+afterXpath_contact;
			String contact=driver.findElement(By.xpath(actual_xpathcontact)).getText();
			System.out.println(contact);
			
		}*/
		 

		        String[] valueToWrite = {"Mr. E","Noida"};
		     

		        //Create an object of FileInputStream class to read excel file

		        FileInputStream inputStream = new FileInputStream("C:\\Users\\admin\\Desktop\\java\\com.tourism.zoo\\src\\test\\resources\\TestData.xlsx");

		        Workbook guru99Workbook = WorkbookFactory.create(inputStream);

		      /*  //Find the file extension by splitting  file name in substring and getting only extension name

		        String fileExtensionName = fileName.substring(fileName.indexOf("."));

		        //Check condition if the file is xlsx file

		        if(fileExtensionName.equals(".xlsx")){

		        //If it is xlsx file then create object of XSSFWorkbook class

		        guru99Workbook = new XSSFWorkbook(inputStream);

		        }

		        //Check condition if the file is xls file

		        else if(fileExtensionName.equals(".xls")){

		            //If it is xls file then create object of XSSFWorkbook class

		            guru99Workbook = new HSSFWorkbook(inputStream);

		        }*/    

		    //Read excel sheet by sheet name    

		    org.apache.poi.ss.usermodel.Sheet sheet = guru99Workbook.getSheet("Sheet1");

		    //Get the current count of rows in excel file

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		    //Get the first row from the sheet

		    org.apache.poi.ss.usermodel.Row row = sheet.getRow(0);

		    //Create a new row and append it at last of sheet

		    org.apache.poi.ss.usermodel.Row newRow = sheet.createRow(rowCount+1);
int count=0;
		    //Create a loop over the cell of newly created Row

		    for(int j = 0; j < row.getLastCellNum(); j++){

		        //Fill data in row
                 System.out.println(count++);
		        Cell cell = newRow.createCell(j);

		        cell.setCellValue(valueToWrite[j]);

		    }

		    //Close input stream

		    inputStream.close();

		    //Create an object of FileOutputStream class to create write data in excel file

		    FileOutputStream outputStream = new FileOutputStream("C:\\Users\\admin\\Desktop\\java\\com.tourism.zoo\\src\\test\\resources\\TestData.xlsx");

		    //write data in the excel file

		    guru99Workbook.write(outputStream);

		    //close output stream

		    outputStream.close();
			
		    }

		 

		    

		
		
	
}


	