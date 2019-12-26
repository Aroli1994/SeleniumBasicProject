package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		
		List<WebElement> allSug = driver.findElements(By.xpath("//input[@title='Search']"));
		
		int count=allSug.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text=allSug.get(i).getText();
			System.out.println(text);
		}
		allSug.get(count-1).click();
		
		

	}

}
