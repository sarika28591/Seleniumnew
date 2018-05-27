package sanitytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gcrregistration {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("//input[@name='gender'] [@value='f']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sarika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mulay");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("05/15/2018");
		driver.findElement(By.xpath("//input[@name= 'email_address']")).sendKeys("acr7282@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("sdajsdhsajdh sadsad");
		driver.findElement(By.name("postcode")).sendKeys("456568");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("state")).sendKeys("MH");
		
		 Select dropDown = new Select (driver.findElement(By.name("country")));
		 dropDown.selectByVisibleText("India");
		 
		 driver.findElement(By.name("telephone")).sendKeys("1234567891");
		 driver.findElement(By.name("password")).sendKeys("1234abcd");
		 driver.findElement(By.name("confirmation")).sendKeys("1234abcd");
		 driver.findElement(By.id("tdb4")).click();
		 
		 String Confirmation=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
		 if(Confirmation.equals("Your Account Has Been Created!")) {
			 System.out.println("Customer registration successful");
		 }else {
			 System.out.println("Customer registration failed");
	}
		 
	}

}
