package seleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().forward();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vineeey@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("V1992");
		//driver.findElement(By.xpath("//input[@id='Log In']")).click();
		driver.navigate().refresh();
	}
}
