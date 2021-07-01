// Test case1 : Valid UserID and Password 

package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {
	
	//test
	public static void main(String[] args) {
		
		WebElement userLocator;
		WebElement Pass;
		WebElement Login;
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver br = new ChromeDriver(); // Open a browser
		 
		 	br.get("http://apps.qaplanet.in/hrm/login.php");
	    
		 	userLocator= br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		 	userLocator.sendKeys("qaplanet1");
		
			 Pass= br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
			 Pass.sendKeys("lab1");
		
			 Login =br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
			 Login.click();
			 String title= br.getTitle();
			 System.out.println(title);
			 
			 if(br.getTitle().equals("OrangeHRM")) {
				 
				 System.out.println("Pass- confirmation page is displayed ");
				 
			 }
			 else {
				 System.out.println("Fail");
			 }
			 br.close();
		
		
		
		 
		 
		
		
	}

}
