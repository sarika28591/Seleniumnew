package Browsercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		
		List<WebElement> list= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement a:list) {
           a.click();
		}
		 
		/* boolean b = false;
		 b = list.get(0).isEnabled();
		 if(b=true) {
			 list.get(1).click();
			 list.get(2).click();
			 
		}else {
			list.get(0).click();
			
		}*/
		 
		/* driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isEnabled());   //true
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isSelected());   //true
		 driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click(); //uncheck
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isSelected()); //false*/
		 
	}

}
