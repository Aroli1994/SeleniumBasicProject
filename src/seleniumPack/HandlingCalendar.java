package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		
//		driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
//		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
		int count=driver.findElements(By.className("day")).size();
		System.out.println("Count of class="+count);
		List<WebElement> date=driver.findElements(By.className("day"));
		String text;
		for(int i=0;i<count;i++)
		{
			text=date.get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				date.get(i).click();
				break;
			}
		}
		
		
		
	}

}
