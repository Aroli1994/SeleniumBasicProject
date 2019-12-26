package seleniumPack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomateFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Title of the page "+ driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("vineeey@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Vinay@1994");
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("After login title is = " + driver.getTitle());
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Profile']")).click();
		System.out.println("Profile name = " + driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.id("u_0_1a"))).build().perform();
		
		//driver.findElement(By.xpath("//a[contains(@data-tab-key,'sports')]")).click();
		
		
		
		driver.findElement(By.id("pageLoginAnchor")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//*[text()='Log Out']")).click();
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.cssSelector("a[title='Vinay Krishna']")).click();
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Vijay@1994");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	}

}
