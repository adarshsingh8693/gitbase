package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws IOException {
         FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
         Workbook wb = WorkbookFactory.create(fis);
         Sheet sheet = wb.getSheet("create");
         int row = sheet.getLastRowNum();
         for(int i=0;i<=row;i++)
         {
        	System.out.println(sheet.getRow(i).getCell(1).getStringCellValue()); 
         }
	}

}
