package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		int iframeCount=driver.findElements(By.tagName("iframe")).size();
		int frameSetCount=driver.findElements(By.tagName("frameset")).size();
		
		System.out.println("iframeCount="+iframeCount+"  frameSetCount="+frameSetCount);
		
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//a[contains(text(),Courses)]")).click();
		
	}

}
