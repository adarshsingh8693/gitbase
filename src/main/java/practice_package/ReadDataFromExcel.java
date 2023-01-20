package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
       String data = wb.getSheet("create").getRow(1).getCell(0 ).getStringCellValue();
       System.out.println(data);
       
        
	}

}
