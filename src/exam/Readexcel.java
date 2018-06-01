package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Readexcel {

	
		
		  //WebDriver driver;
		  //WebDriverWait wait; 
		  XSSFWorkbook workbook;
		  XSSFSheet sheet;
		  XSSFCell cell;
		 

		
		 public void ReadData() throws IOException{
		 
		 // Import excel sheet.
		 
		 File src=new File("C:\\Users\\admin\\eclipse-workspace\\Seleniumtesttwo\\src\\objreository\\testdata.xlsx");
		 
		  // Load the file.
		 
		  FileInputStream finput = new FileInputStream(src);
		 
		 // Load he workbook.
		 
		 workbook = new XSSFWorkbook(finput);
		 
		 sheet=workbook.getSheet("sheet1");
		//System.out.println(sheet.getRow(0).getCell(0)); 
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			System.out.println(sheet.getRow(i).getCell(0)); 
		}
		
		 // Load the sheet in which data is stored. sheet= workbook.getSheetAt(0);
		 
		 }
	
		 


      public static void main(String[] args) throws IOException {
    	  Readexcel obj=new Readexcel();  
	       obj.ReadData();
}
}


