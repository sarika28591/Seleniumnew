package Browsercommands;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handledropdownbox {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 Select dropDown = new Select (driver.findElement(By.name("continents")));   //select instance
		 //dropDown.selectByIndex(6);  //select an item by index
		 dropDown.selectByVisibleText("Africa");   //another method by value selection method
		 
		 
		 
		 List<WebElement> e =dropDown.getOptions();
		 int itemsCount=e.size();
		 System.out.println(itemsCount);   //7
		 
	}

}
