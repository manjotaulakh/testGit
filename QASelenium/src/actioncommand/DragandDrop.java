package actioncommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
	
		br.get("https://chandanachaitanya.github.io/selenium-practice-site");
		WebElement element = br.findElement(By.id("click"));
		Actions act = new Actions(br);
		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(6000);
		 act.dragAndDropBy(element, 50, 100);
		 Thread.sleep(6000);
		 act.perform();
		 Thread.sleep(6000);
		 act.release(); 
		
	/*	Actions act= new Actions(br);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
	    WebElement  click =br.findElement(By.xpath("//li[@id='click']"));
	    WebElement sendKeys = br.findElement(By.xpath("//li[@id='sendKeys']"));
	    Thread.sleep(3000);
	    act.clickAndHold(click).moveToElement(sendKeys).release().build().perform();*/
		
		

	}

}
