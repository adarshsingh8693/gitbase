package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet("create").getRow(1).getCell(1).setCellValue("Golu");
        FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
        wb.write(fos);
       // wb.close();
                  
	}

}
