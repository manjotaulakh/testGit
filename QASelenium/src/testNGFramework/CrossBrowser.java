package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver dd;

  @Test
  @Parameters("browser")
  
	  public void CrB(String ibr) {
		if (ibr.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Downloads\\Browsers Drivers\\geckodriver-v0.29.1-win64 (1)\\geckodriver.exe");
	        dd=new FirefoxDriver();
	        System.out.println("running with FF");
		}
		else if(ibr.equalsIgnoreCase("gg"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			
			dd=new ChromeDriver();
			System.out.println("running with chrome");
		}
		
		dd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		dd.get("http://apps.qaplanet.in/hrm/login.php");
	    
	 	dd.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	      
		
  }
}
