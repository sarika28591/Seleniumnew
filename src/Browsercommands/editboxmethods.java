package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class editboxmethods {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		 
		   
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  
		  
		  //driver.findElement(By.id("identifierId")).sendKeys("sarika"); 
		  //driver.findElement(By.name("identifier")).sendKeys("sarika"); 
		  // driver.findElement(By.tagName("input")).sendKeys("sarika"); 
		  //driver.findElement(By.cssSelector("#identifierId")).sendKeys("sarika"); 
		  driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("sarika"); 
		  
		  
		  String text = driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]")).getText(); 
		  System.out.println(text);   //returns inner text
		  
		 
		  driver.findElement(By.xpath(".//*[@id='identifierId']")).clear();
		  String c=driver.findElement(By.xpath(".//*[@id='identifierId']")).getAttribute("type");
		  System.out.println(c);              //return value given to attribute
		
		  
		  
		  boolean a= driver.findElement(By.xpath(".//*[@id='identifierId']")).isEnabled();
		  System.out.println(a);
		  
		  boolean b= driver.findElement(By.xpath(".//*[@id='identifierId']")).isDisplayed();
		  System.out.println(b);
		  
	}
	
	

}
