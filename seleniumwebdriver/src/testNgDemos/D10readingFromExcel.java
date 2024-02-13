package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D10readingFromExcel {
	File file;
	FileInputStream fis;
	String path = "D:\\\\seleniumExcel\\\\myexcel.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test
	public void readingfromExcel() 
	{
		int rows = sheet.getPhysicalNumberOfRows();
		int coloumns = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rows;i++)
		{
			row=sheet.getRow(i);

			for(int j=0;j<coloumns;j++)
			{
				cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}
	@BeforeTest
	public void beforeTest() throws IOException
	{
		file = new File(path);
		fis=new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet0");
	}

	@AfterTest
	public void afterTest() throws IOException
	{
		wb.close();
		fis.close();
	}

}
