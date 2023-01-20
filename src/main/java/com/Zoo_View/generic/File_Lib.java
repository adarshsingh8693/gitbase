   package com.Zoo_View.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class File_Lib {
	
	
	/**
	 * Author Adarsh
	 * @param key
	 * @return data
	 * @throws IOException
	 */
	
	public String getDataProperty(String key) throws IOException {
		
		 FileInputStream fis= new FileInputStream(IPathConstants.FilePath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String data = pobj.getProperty(key);
	return data;
	
	}
	
	public void setDataProperty() {
		Properties properties = new Properties();
		try {
		FileOutputStream outputStream = new FileOutputStream(IPathConstants.FilePath);
		
	    properties.setProperty("prop1", "Value1"); 
		properties.store(outputStream, null);
		}
		catch (IOException e)
		{ 
			e.printStackTrace();
		}
		
	} 
	public String getExcelData(String sheet,int row,int cell) throws IOException
	{
		 FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString(); 
		return data;
		 
	}
	public void setExcelData(String sheet,int row,int cell,String value) throws IOException {
		 FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
	 wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	    //int noOfRow = sheetName.getLastRowNum();
	    FileOutputStream fos=new FileOutputStream(IPathConstants.ExcelPath);
	    wb.write(fos);
	    wb.close();
				
		
	}
	public int getLastRowNum(String sheet) throws IOException
	{
		 FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheetName = wb.getSheet(sheet);
		int noOfRow = sheetName.getLastRowNum();
		return noOfRow;
		
	}
	public Map<String,String> getList(String sheet,int keyCell,int valueCell,WebDriver driver) throws IOException {
	 FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);   
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheetName = wb.getSheet(sheet);
		int noOfRow = sheetName.getLastRowNum();
		HashMap<String,String> map=new HashMap<String, String>();
		for(int i=0;i<=noOfRow;i++) {
		      String key = sheetName.getRow(i).getCell(keyCell).getStringCellValue();
		      String value=sheetName.getRow(i).getCell(valueCell).getStringCellValue();
		      map.put(key, value);
		      }
		for(Entry<String, String> set:map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	
		}
		return map;
		}
	public Object[][] readMultipleSetOfData(String sheetName) throws IOException{
		
		FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sheet=wb.getSheet(sheetName);
		int lastRow=sheet.getLastRowNum();
		int lastCell=sheet.getRow(0).getLastCellNum();
		
		
		Object[][] obj=new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++) {
			for(int j=0;j<lastCell;j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
	}
	
}
