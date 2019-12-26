package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayLinkHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		System.out.println("No. of links in a page: ");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		System.out.println("No. of links in footer section: ");
		WebElement footer=driver.findElement(By.id("glbfooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		System.out.println("No. of links in one column section: ");
		WebElement footerCol=driver.findElement(By.xpath("/html/body/div[5]/footer/div[2]/table/tbody/tr/td[2]/ul"));
		int colSize=footerCol.findElements(By.tagName("a")).size();
		System.out.println(colSize);		
		
		System.out.println("Link names column section: ");
		for(int i=0;i<colSize;i++)
		{
			System.out.println(footerCol.findElements(By.tagName("a")).get(i).getText());
		}
		
		
		String BeforeClicking = null;
		String AfterClicking;
		String link = null;
		System.out.println("Clicking link using for loop present in column section: ");
		for(int i=0;i<colSize;i++)
		{
			link=footerCol.findElements(By.tagName("a")).get(i).getText();
			if(link.contains("Site map"))
			{
				BeforeClicking=driver.getTitle();
				System.out.println("Before clicking site map link: "+BeforeClicking);
				footerCol.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		AfterClicking=driver.getTitle();
		System.out.println("After clicking site map link: "+AfterClicking);
		
		System.out.println("Selenium validates the expected & actual link page openend: PASS or FAIL");
		
		if(AfterClicking!=BeforeClicking)
		{
			boolean abc=driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed();
			if(abc==true)
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		System.out.println("No. of links in page "+link+" :");
		System.out.println(driver.findElements(By.tagName("a")).size());
	}

}
