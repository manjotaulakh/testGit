package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("");

		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).sendKeys("");
		
		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		
		String msg= br.switchTo().alert().getText();
		System.out.println(msg);
		
		if(msg.equals("User Name not given!")) {
			System.out.println("test case passed");
		}
			else {
				System.out.println("testcase failed");
			}
			
		   br.switchTo().alert().accept();  // for closing the alert 
		}
		
	
	}


