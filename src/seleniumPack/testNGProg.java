package seleniumPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class testNGProg {
	
	public WebDriver driver;
	public String baseurl="https://www.google.com";
	String driverpath="D:\\SELENIUM\\chromedriver.exe";

	@BeforeTest
	public void setBaseUrl()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	
	@Test
	public void verifyHomePage()
	{
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void EndSession()
	{
		driver.close();
	}
	
}
