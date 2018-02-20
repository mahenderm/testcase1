package com.wipro.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	public ExcelSheet(String filepath, int sheetIndex) throws IOException{
		File file=new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet=workbook.getSheetAt(sheetIndex);
		
	}
	public int numofRows(){
		int rows_sheet = sheet.getLastRowNum()-sheet.getFirstRowNum();
		return rows_sheet;
	}
	public String getData(int rowNum,int cellNum){
		String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
	}
}
