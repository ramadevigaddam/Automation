package selenium.Automation;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class Facebook_loginTest {
	static WebDriver driver;
	
	@Test(priority=1)
	public static void screenshot(String str) throws IOException {
		DateFormat df=new SimpleDateFormat("yyyy/mmm/dd/hh/mm/ss");
		Date d=new Date(0);
		String time=df.format(d);
		System.out.println(time);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshot\\"+str+".png"+""+ "dateformat"));
			
		}
		@Test(priority=2)
		public void login() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable-notifications");
	  driver=new ChromeDriver(options);
      driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	 screenshot("urlpage");
	  driver.findElement(By.id("email")).sendKeys("gaddamramadevi09@gmail.com");
	  driver.findElement(By.name("pass")).sendKeys("bobby@#1986");
	  driver.findElement(By.id("loginbutton")).click();
	  Thread.sleep(2000);
	  screenshot("login");
	  Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='text'and @placeholder='Search' and @class='_1frb']")).sendKeys("bobby cool");
		 List<WebElement>names=driver.findElements(By.xpath("//div[@class='_21r']//li"));
		 System.out.println("number of suggestion is"+names.size());
		 
		 for(int i=0; i<names.size();i++) {
			 System.out.println(names.get(i).getText());
			 if(names.get(i).getText().contains("bobby cool")) {
				 names.get(i).click();
				 driver.findElement(By.xpath("//div[@id='xt_uniq_3']//a[contains(text(),'Bobby Cool')]")).click();
				 break;
			 }
		 }
	}
	
		
  @Test
public static void main (String[] args) throws InterruptedException, IOException {
	  Facebook_loginTest f=new Facebook_loginTest();
  
	  f.login();
	  Facebook_loginTest.screenshot(null);
	 
	 
	  
  }
  
  
}
