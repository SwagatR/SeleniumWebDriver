package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D09writingtoExcel {
	File file;
	FileOutputStream fos;
	String Path= "D:\\seleniumExcel\\myexcel.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
  @Test
  public void writeToExcel()
  {
	  row=sheet.createRow(0);
	  cell = row.createCell(0);
	  cell.setCellValue("Good");
	  cell = row.createCell(1);
	  cell.setCellValue("Morning");
	  System.out.println("data Written");
	  
	  row = sheet.createRow(2);
	  cell = row.createCell(4);
	  cell.setCellValue("Seed");
	  cell = row.createCell(5);
	  cell.setCellValue("InfoTech");
	  System.out.println("Seed Infotech Is Written");
	  
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException 
  {
	  file = new File(Path);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet();
  }

  @AfterTest
  public void afterTest() throws IOException
  {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
