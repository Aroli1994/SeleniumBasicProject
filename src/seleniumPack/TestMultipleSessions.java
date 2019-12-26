package seleniumPack;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.Test;
		public class TestMultipleSessions {
		    @Test    
		    public void executSessionOne(){
		        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		            WebDriver driver = new ChromeDriver();
		            driver.get("https://www.facebook.com/");
		         
		            driver.findElement(By.name("firstname")).sendKeys("Prashanth");
		            
		        }
		        
		    @Test    
		        public void executeSessionTwo(){
		            
		        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		            
		        driver.get("https://www.facebook.com/");
		        
		        driver.findElement(By.name("firstname")).sendKeys("kumar");
		        
		        }
		        
		    @Test    
		        public void executSessionThree(){
		            
		        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		            
		        driver.get("https://www.facebook.com/");
		       
		        driver.findElement(By.name("firstname")).sendKeys("Pkumar");
		        
		        }        
		}




