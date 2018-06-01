package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;

public class Writeintoexcel {
	public static void main(String[] args) {
		try {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

			driver.findElement(By.name("q")).sendKeys("iphonex");
			driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//div[contains(text(),'Price -- High to Low')]")).click();

			List<WebElement> searchele = driver.findElements(By.xpath("//div[contains(text() , 'Apple iPhone')]"));
			ArrayList<String> array3 = new ArrayList<String>();

			for (WebElement sugg : searchele) {

				System.out.println(sugg.getText());
				array3.add(sugg.getText());
			}
			System.out.println("printing array");

			for (int i = 0; i < array3.size(); i++) {

				System.out.println(array3.get(i));

			}
			File src = new File("C:\\Users\\admin\\eclipse-workspace\\Seleniumtesttwo\\src\\objreository\\testdata.xlsx");

			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = workbook1.getSheetAt(0);
			Row row;

			for (int i = 0; i < array3.size(); i++) {
				FileOutputStream fout = new FileOutputStream(src);

				// sheet.getRow(2).createCell(0).setCellValue(al.get(1));
				// Specify the file in which data needs to be written.
				row = sheet1.createRow(i);
				row.createCell(0).setCellValue(array3.get(i));

				// finally write content
				workbook1.write(fout);
				// close the file
				fout.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
