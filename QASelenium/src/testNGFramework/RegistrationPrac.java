package testNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RegistrationPrac {
	
	WebDriver br;
	
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	   br = new ChromeDriver();
	   br.get("http://demo.automationtesting.in/Register.html");
}
  @Test( enabled=true,priority=1,groups= "mainPage")
  public void f() {
	  
	  br.findElement(By.xpath("//input[contains(@type,'text')] ")).sendKeys("Manjot");
	  
	  By lastname =By.xpath("//input[@placeholder='Last Name']");
	  br.findElement(lastname).sendKeys("Aulakh");
  }
  @AfterMethod
  public void afterMethod() {
	  br.close();
  }

}
