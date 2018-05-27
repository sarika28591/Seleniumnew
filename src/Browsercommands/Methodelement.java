package Browsercommands;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		 
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  //edit box operations
		  driver.findElement(By.id("identifierNext")).click();   
		  driver.findElement(By.id("identifierId")).sendKeys("sarika"); 
		  Thread.sleep(5000);//5 sec
		  driver.findElement(By.id("identifierId")).clear();
		  
		  boolean a=driver.findElement(By.id("identifierNext")).isEnabled();
		  System.out.println(a);
		  
		  boolean b=driver.findElement(By.id("identifierNext")).isDisplayed();
		  System.out.println(b);       //existance
		  
		  
		  
		  
		  driver.manage().window().maximize();
		 // driver.manage().window().setPosition(new Point(0, -1000));
		
	}

}
