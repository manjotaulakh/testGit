package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		// Browser commands 
		//sadar reqested
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver(); // Open a browser 
		
		br.get("https://www.redbus.in/");
		
	    String Title= br.getTitle();
		System.out.println(Title);
		
		 String Url=br.getCurrentUrl();
	    //System.out.println(Url);
		
		// Navigation Commands -
		
	/*	br.navigate().to("https://www.facebook.com/login.php ");
		
		br.navigate().back();
		br.navigate().forward();
		br.navigate().refresh();

		br.manage().window().maximize(); */
		
		
		Navigation n =br.navigate();
		n.to("https://www.facebook.com/login.php");
		n.back();
		n.forward();
		n.refresh();
		
		br.close();
		
	}

}
