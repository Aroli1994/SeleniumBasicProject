package seleniumPack;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://in.ebay.com/");
		
		/*
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mi tv");
		
		driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
		
		driver.findElement(By.className("vh79eN")).click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Men')]"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Formal Shoes"))).click();	
		*/
		
		//driver.findElement(By.id("gh-ac")).sendKeys("watch");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the search input: ");
//		String str=sc.nextLine();
//		
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("shoes");
		//Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.id("gh-ac")).sendKeys("watch");
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("sports");
		driver.navigate().refresh();
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("clothes");
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-')]")).sendKeys("furnitures");
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-')]")).sendKeys("headphones");

	}

}
