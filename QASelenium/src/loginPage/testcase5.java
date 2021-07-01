package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testcase5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
	   br.manage().window().maximize();
	   WebElement UserName=br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
	   UserName.sendKeys("qaplanet1");
	   WebElement password=br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
	   password.sendKeys("Lab1");
	   br.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).click();
		
	   Assert.assertTrue(UserName.getText().isEmpty() && password.getText().isEmpty());
	   System.out.println("testcase Passed for clear button");
		/*if(UserName.getText().isEmpty() && password.getText().isEmpty())
			{
			
			System.out.println("testcase Passed for clear button");
		}
		else {
			System.out.println("failed");
		}*/
		br.close();
	}
}
