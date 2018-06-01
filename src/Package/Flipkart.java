package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	String obj=driver.getWindowHandle();
    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    
    /*Actions builder =new Actions(driver);
    WebElement menu=driver.findElement(By.xpath("//a[@href='javascript:;'][@title='Men']"));
    builder.moveToElement(menu).build().perform();*/ 
    
    Actions a = new Actions(driver);
    for(String handle : driver.getWindowHandles()) {
       driver.switchTo().window(handle);
    }
    a.moveToElement(driver.findElement(By.xpath("//a[@href='javascript:;'][@title='Men']")));
    a.perform();
    
    List <WebElement> items=driver.findElements(By.xpath("//a[@class='_3ZgIXy'][@title='Top wear']"));
   
    String newlist = null;
    String newlist1="Bottom wear";
    
    for (WebElement sugg : items) {

        //System.out.println(sugg.getText());
      newlist=sugg.getText();
     
     }
    
    
    String[] menus = newlist.split("\\n"); 
    System.out.println("************************");
    for (String i: menus) {
     
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
