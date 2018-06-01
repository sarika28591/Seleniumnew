package Package;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartnew {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.flipkart.com");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
	      
	    Actions a = new Actions(driver);
	    for(String handle : driver.getWindowHandles()) {
	    driver.switchTo().window(handle);
	    }
	    a.moveToElement(driver.findElement(By.xpath("//li//a[@title='Men']")));
	    a.perform();
	    
	    Thread.sleep(2000);
	    
	    List <WebElement> cnt1=driver.findElements(By.xpath("/html/body/div/div/header/div[3]/div/ul/li[3]/ul/li/ul/li[2]/ul"));
	      
	    String newlist = null ;
	    String newlist1="Bottom wear";
	      
	  
	      
	      for (WebElement sugg : cnt1) {

	         //System.out.println(sugg.getText());
	       newlist=sugg.getText();
	      
	      }
	      String[] items = newlist.split("\\n"); 
	  

	      System.out.println("************************");
	      for (String i: items) {
	       //System.out.println(i);
	   if(i.equals(newlist1))
	   {
	   break;
	   }
	  else
	   {
	   System.out.println(i);
	   }

	      }
	 }
	
	

	}


