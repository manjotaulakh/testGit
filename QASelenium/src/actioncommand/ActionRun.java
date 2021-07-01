package actioncommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver(); // open the browser
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
		Actions act = new Actions(br);
		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		
		act.moveToElement(br.findElement(By.xpath("//body/div[@id='top-menu']/ul[@id='nav']/li[@id='admin']/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		act.moveToElement(br.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		act.moveToElement(br.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		br.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]/span[1]")).click();
	}

}
