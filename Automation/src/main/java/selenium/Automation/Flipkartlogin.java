package selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkartlogin {
	static WebDriver driver;
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\chromedriver.exe");
        // TODO Auto-generated method stub
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 driver.findElement(By.name("q")).sendKeys("iphone");
		 driver.findElement(By.className("vh79eN")).click();
		 driver.findElement(By.className("_3wU53n")).click();
		 Select PC=new Select (driver.findElement(By.xpath("//div[@class='_1qKb_B']//select[@class='fPjUPw']")));
		 
				 
				 
				 
				 
				 
	
		 
		 
		 
		 	
	
	}

}
