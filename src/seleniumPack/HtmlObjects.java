package seleniumPack;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;

public class HtmlObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To Switch OFF CHROME(version>50) notifications
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		//To Switch OFF CHROME(version<50) notifications
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);*/
		
		
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//driver.get("https://www.spicejet.com/");
		
		//STATIC DROP DOWN 
		/*Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByValue("option3");
		s.selectByIndex(2);
		*/
		
		//DYNAMIC DROP DOWN
		/*
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		*/
		
		//CHECK BOX
		/*
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		*/
		
		//RADIO BUTTONS
		/*
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		*/
		/*
		int count=driver.findElements(By.xpath("//input[@name='radioButton']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
			//System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).getAttribute("value"));
	  		String text=driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).getAttribute("value");
	  		if(text.equals("radio2"))
	  		{
	  			 driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
	  		}
	  		
		}
		*/
		
		//JAVASCRIPT ALERT
		
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //ok, done, yes
		
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); //cancel, no, reject
		
		//driver.switchTo().alert().sendKeys("Send input to edit box of alert pop-up");
		
		
		//WEBDRIVER FORM METHODS
		/* not completed
		 * isDisplayed() method
		driver.get("https://www.makemytrip.com");
		//System.out.println(driver.findElement(By.xpath("//input[@class='custom_date_pic required home-date-input']")).isDisplayed());
		System.out.println("Before clicking multi city: Return date");
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw ']/div/div[4]")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='makeFlex']/ul/li[3]/span")).click();
		System.out.println("After clicking multi city: Return date");
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw ']/div/div[4]")).isDisplayed());
		*/
		
		//isEnabled() method
		/*
		driver.get("https://www.makemytrip.com");
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw ']/div")).isEnabled());
		*/
		
		/*driver.findElement(By.xpath("//div[@class='makeFlex']/ul/li[3]/span")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw ']/div/div[4]/div")).isDisplayed());*/
		
		/* wrong code [select mutli city and round trip]
		 * driver.findElement(By.xpath("//div[@class='makeFlex']/ul/li[3]/span")).click();
		System.out.println(driver.findElement(By.xpath("//button[@class='btnAddCity']")).isDisplayed());
		
		driver.findElement(By.xpath("//div[@class='makeFlex']/ul/li[2]/span")).click();
		System.out.println(driver.findElement(By.xpath("//button[@class='btnAddCity']")).isEnabled());*/
		
		//CALENDAR
		/*
		driver.findElement(By.xpath("//div[@class='fsw ']/div/div[3]")).click();
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri Aug 02 2019']")).click();
		*/
		
		//No. of Passengers
		/*driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//div[@id='BE_flight_paxInfoBox']/span")).click();
		//CHROME browser notification stopped
		int i=0;
		while(i<7)
		{
			driver.findElement(By.xpath("//span[@class='ddSpinnerPlus']")).click();
			i++;
		}*/
		
		
		 
	}

}
