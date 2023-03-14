package com.inventsuite.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class FileLib {
	public String getProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\data (1).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return data;
	}
	
	public int getExcelData2(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\data (1).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int data = (int) wb.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		wb.close();
		return data;

}
	public String getExcelData3(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Cell value = wb.getSheet(sheetName).getRow(row).getCell(cell);
		 String data2 = NumberToTextConverter.toText(value.getNumericCellValue());
		 return data2;
		}
	public String setExcelData(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\data (1).xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		 FileOutputStream fos= new FileOutputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\data (1).xlsx");
		 wb.write(fos);
		 wb.close();
		return value;
		 }
	public double setExcelData2(String sheetName,int row,int cell,int i) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\data (1).xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(cell);
		 FileOutputStream fos= new FileOutputStream("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\java\\data\\data (1).xlsx");
		 wb.write(fos);
		 wb.close();
		return cell;
		 }
	
}

	
