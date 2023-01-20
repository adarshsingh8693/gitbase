package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.IPathConstants;

public class DataProviderExcelBytMadam  {
	
	
	@Test(dataProvider="getData")
	public void readData(String from,String to) {
		System.out.println(to+"   "+from);
	}
   @DataProvider
	public Object[][] getData() throws IOException{
		File_Lib fl=new File_Lib();
		Object [][]value=fl.readMultipleSetOfData("create");
		return value;
	
		
	} 
   
  /* @Test(dataProvider="getData")
   public void SetDatas() throws IOException {
   FileInputStream inputStream = new FileInputStream(IPathConstants.ExcelPath);
   
   
   Workbook guru99Workbook = WorkbookFactory.create(inputStream);
   
   Sheet sheet = guru99Workbook.createSheet("ashish");
   
   
		Object ob[][]= {
				   {"EmpId","Name","Job"},
				   {101,"Adarsh","Software"},
				   {102,"ashish","Softwaredev"}
	};
		  
   
		   
   
   int row=ob.length;
   System.out.println(row);
   int cell=ob[0].length;
   for(int r=0;r<row;r++) {
	   Row rowc = sheet.createRow(r);
	  for(int c=0;c<cell;c++) {
		  Cell cellc = rowc.createCell(c);
		  Object value=ob[r][c];
		  if(value instanceof String)
			  cellc.setCellValue((String)value);
		  if(value instanceof Integer)
			  cellc.setCellValue((Integer)value);
		  if(value instanceof Boolean)
			  cellc.setCellValue((Boolean)value);
		  
		  
	  } 
   }
   
   FileOutputStream fos=new FileOutputStream(IPathConstants.ExcelPath);
   guru99Workbook.write(fos);
   
   
   }*/
   
   
}
