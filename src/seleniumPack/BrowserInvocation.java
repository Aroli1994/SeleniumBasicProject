package seleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe"); //for Firefox browser 
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\SELENIUM\\IEDriverServer.exe");
		String baseUrl="http://www.qaclickacademy.com/";
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //to maximize the browser window
		driver.get(baseUrl);  //get to hit the URL
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl()); //to check the current URL
		//driver.close();
		
	}

}
