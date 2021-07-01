package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("haaab1");
		
		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		
		String text = br.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(text);
		
		
		
		//if(br.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
		
		
		if(text.equals("Invalid Login")) {
			
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}
		
		br.close();

	}

}
