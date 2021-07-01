package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertyExecution {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		Properties po = new Properties();
		FileInputStream fpath = new FileInputStream(System.getProperty("user.dir")+"/src/propertyFile/locator.properties");
		po.load(fpath);
		
		
		br.get(po.getProperty("bpath"));
		
		br.findElement(By.xpath(po.getProperty("uid"))).sendKeys("qaplanet1");
		br.findElement(By.xpath(po.getProperty("uPasword"))).sendKeys("lab1");
		br.findElement(By.xpath(po.getProperty("Login"))).click();
		br.findElement(By.linkText(po.getProperty("LogoutValue"))).click();  */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
	    Properties obj = new Properties();
	    FileInputStream fpath = new FileInputStream(System .getProperty("user.dir")+"/src/propertyFile/locator.properties");
	    obj.load(fpath);
	    br.get(obj.getProperty("Url"));
	   
	    
	    br.findElement(By.xpath(obj.getProperty("checkboxvalue"))).click();
	     
	    
	    br.findElement(By.xpath(obj.getProperty("radiobutton"))).click();
	    Thread.sleep(1000);
	    
	    Select list = new Select(br.findElement(By.xpath(obj.getProperty("listvalue"))));
	    list.selectByIndex(3);
	    list.selectByValue("Python");
	    Thread.sleep(1000);
	    
	    Select ml= new Select(br.findElement(By.xpath(obj.getProperty("multilist"))));
	    ml.selectByIndex(1);
	    ml.selectByValue("RC");
	    ml.selectByVisibleText("Limitations");
	    
	    
	}

}


