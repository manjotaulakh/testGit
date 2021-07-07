package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementPrac {
//sadar
	public static void main(String[] args) {
		By usernameLocator;
		WebElement userId;
		WebDriver br;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 br = new ChromeDriver(); // Open a browser 
		
		br.get("http://apps.qaplanet.in/hrm/login.php");
	     usernameLocator=By.xpath("//tbody/tr[2]/td[2]/input[1]");

		 userId= br.findElement(usernameLocator);
		userId.sendKeys("qaplanet1");
		
		
		
		
		
		
		
		
		
		
		
       
		
		
		
		
		
		
	/*	br.get("http://apps.qaplanet.in/hrm/login.php");
		String title =br.getTitle();
		System.out.println(title);
		Navigation n = br.navigate();
		n.to("https://www.facebook.com/login.php");
		n.refresh();
		n.back();*/
		
	
		
		
		

	}

}
