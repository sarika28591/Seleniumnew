package Package;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=ec4207ac-360c-47a2-acd1-8f3ae5f9c6a4&ie=UTF8"); 
		 
		  //Actions builder =new Actions(driver);
		  //WebElement menu=driver.findElement(By.xpath("//span[contains(text(),'Your Orders')][@class='nav-line-2']"));
		  //builder.moveToElement(menu).build().perform();   //build to perform operations
		  //driver.findElement(By.linkText("Sign in")).click();
		  //Thread.sleep(10000);
		  //driver.navigate().back();
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch");
		  driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']")).click();
		  driver.findElement(By.xpath(".//*[@id='result_4']/div/div/div/div[1]/div/div/a/img")).click();
		  
		  String parent=driver.getWindowHandle();
		  Set<String> Handles=driver.getWindowHandles();
		  int BrowserCount=Handles.size();
		  System.out.println(BrowserCount);   

		  //switch focus
		  for(String s1:Handles){
		  if (! s1.equals(parent)){
		  driver.switchTo().window(s1);
		  driver.findElement(By.linkText("Add to Cart")).click();
		  
		  
		  
		  }
		  }
		  
		  
		  
		  /*String obj=driver.getWindowHandle();
		System.out.println(obj);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();*/


		 
		/* driver.findElement(By.xpath("//a[@href='/account/login?signup=true']")).click();
		 driver.findElement(By.xpath("//input[@type='text'] [@class='_2zrpKA']")).sendKeys("9503961409");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c'] [@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).sendKeys("798321");*/
	}

}
