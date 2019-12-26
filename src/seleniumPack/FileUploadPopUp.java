package seleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
/*		driver.get("https://www.naukri.com/online-product-upload-jobs");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[title='Click to upload your resume']")).click();
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\VinayKrishna141\\Downloads\\vijay.docx");*/
		
		driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		driver.findElement(By.id("textbox")).sendKeys("vinay plz download file");
		driver.findElement(By.id("create")).click();
		driver.findElement(By.linkText("Download")).click();
	}

}
