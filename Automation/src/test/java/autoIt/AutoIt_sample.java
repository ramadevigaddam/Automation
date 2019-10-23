package autoIt;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AutoIt_sample {
	public WebDriver driver;
  @Test
  public void autoit() throws IOException {
	  driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
//	  Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop");
  }
  @BeforeTest
  public void beforeTest() {
	   driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	  driver.navigate().to("https://www.pdf2doc.com");
	  driver.manage().window().maximize();
  }
 @AfterTest
 public void afterTest() {
	 driver.quit();
 }
 
}
