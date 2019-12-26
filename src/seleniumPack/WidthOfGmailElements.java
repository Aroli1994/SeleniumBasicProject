package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthOfGmailElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.gmail.com");
		
		int width1=driver.findElement(By.id("identifierId")).getSize().getWidth();
		int width2=driver.findElement(By.id("identifierNext")).getSize().getWidth();
		
		if(width1==width2)
		{
			System.out.println("username and button are of same size/width: width1="+width1+" width2:"+width2);
		}
		else
		{
			System.out.println("username and button are of not same size/width: width1="+width1+" width2="+width2);
		}

	}

}
