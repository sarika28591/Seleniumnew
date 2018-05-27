package Browsercommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		 
		 //switch to 3rd frame
		 driver.switchTo().frame(2);   //switching to the frame
		 driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
         
		 Thread.sleep(3000);
		 //switch from 3rd frame to topwindow
		 driver.switchTo().defaultContent();
		 
		 //switch to first frame
		 driver.switchTo().frame(0);   //switching to the frame
		 driver.findElement(By.linkText("org.openqa.selenium.html5")).click();
	
	}


}
