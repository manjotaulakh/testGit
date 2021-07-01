package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.linkText("OrangeHRM")).click();
		
		String title = br.getTitle();
		System.out.println(title);
		
		if(title.equals("OrangeHRM - New Level of HR Management")) {
			
			System.out.println("Test case Passed ");
			
		}
		else {
			System.out.println("test case failed");
		}
		       br.close();
	}

}
