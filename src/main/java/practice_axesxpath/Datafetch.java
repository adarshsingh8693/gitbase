package practice_axesxpath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Zoo_View.generic.IPathConstants;

public class Datafetch {

	public static void main(String []args) throws EncryptedDocumentException, IOException, InterruptedException {
          
		
			 FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
			Workbook wb = WorkbookFactory.create(fis);
			 Sheet data = wb.getSheet("Sheet1"); 
			 int count = data.getLastRowNum();
			 Row row = data.getRow(0);
			 short cell = row.getLastCellNum();
		
			System.out.println(cell);
			 for(int i=0;i<=count;i++) {
				 
				 Thread.sleep(1000);
				
				 int j=0;
				while(j<cell){
				  System.out.println(j);
				   Row datas = data.getRow(i);
				  Cell cells = datas.getCell(j);
				  String datass = cells.toString();
				
				j++;
				
			 }
			
		
	}
	/*FileInputStream fis1=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb1 = WorkbookFactory.create(fis1);
	 wb.getSheet("sheet1").getRow(0).getCell(1).setCellValue("skipped");
	    //int noOfRow = sheetName.getLastRowNum();
	  //FileOutPutStream fos=new FileOutPutStream("./src/test/resources/TestData.xlsx");
	   
	
	 //setExcelData("sheet1",1,2,"skipped"); 
		
				
		
	
			 wb.close();	
	}
	/*public static void setExcelData(String sheet,int row,int cell,String value) throws IOException {
		 FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
	 wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	    //int noOfRow = sheetName.getLastRowNum();
	    FileOutputStream fos=new FileOutputStream(IPathConstants.ExcelPath);
	    wb.write(fos);
	  
				
		
	}*/

}}
