package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleBrowsers {	
		// TODO Auto-generated method stub
		
		
		@Test
		public void executeSessionOne()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("firstname")).sendKeys("vinay");
		}
		
		@Test
		public void executeSessionTwo()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("firstname")).sendKeys("niranjan");
		}
		
		@Test
		public void executeSessionThree()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("firstname")).sendKeys("vijay");
		}
}
