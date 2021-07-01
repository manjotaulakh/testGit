package testNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RunTestNgFramework {
	
	WebDriver br;
	String buildPath="http://apps.qaplanet.in/hrm/login.php";
  
  @BeforeMethod
  public void beforeMethod() {
	     System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 br = new ChromeDriver(); // Open a browser
	 
	 	br.get(buildPath);
  }

  @AfterMethod
  public void afterMethod() {
	  br.close();
  }
  
  @Test (enabled=true,priority=1,groups="Login")
  public void testcase1() {
	    
		        WebElement	userLocator= br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
			 	userLocator.sendKeys("qaplanet1");
			
			 	WebElement Pass= br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
				 Pass.sendKeys("lab1");
			
				 WebElement Login =br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
				 Login.click();
				 String title= br.getTitle();
				 System.out.println(title);
				 Assert.assertEquals(br.getTitle(), "OrangeHRM"); 
		 }
  
  @Test (enabled=true,priority=2,groups="Login")
  	public void testcase2() {
  		
  		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("ghPlanet1");
  		br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
	    br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	
  		String text = br.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
  		System.out.println(text);
  		Assert.assertEquals(text, "Invalid Login");
  		System.out.println("Pass");
  		
  		}
  
  @Test (enabled=true,priority=3,groups="Login")  	
  	void testcase3() {
  		
  		
  		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
  		br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("haaab1");
  		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
  		
  		String text = br.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
  		System.out.println(text);
  		Assert.assertEquals(text, "Invalid Login");
  		System.out.println("Pass");
  	    }
  
  @Test (enabled=true,priority=4,groups="Login")
  	
    void testcase4() {
  		
  		
  		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("hjklplanet1");
  		br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("haaab1");
  		
  		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
  		
  		String text = br.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
  		System.out.println(text);
  		Assert.assertEquals(text, "Invalid Login");
  		System.out.println("Pass");
  	    }
  
  @Test (enabled=true,priority=5,groups="Login")
    void testcase5() {
    	
	   br.manage().window().maximize();
	   WebElement UserName=br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
	   UserName.sendKeys("qaplanet1");
	   WebElement password=br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
	   password.sendKeys("Lab1");
	   br.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).click();
		
		Assert.assertTrue(UserName.getText().isEmpty() && password.getText().isEmpty());
		System.out.println("testcase Passed for clear button");
		
		
	}
  
  @Test (enabled=false,priority=6,groups="Login")
    
    void testcase6() {
    	
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.linkText("OrangeHRM")).click();
		String title = br.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
		System.out.println("Test case Passed ");
	    
    }
    
  @Test (enabled=true,priority=7,groups="Login")
    void testcase7() {
    	
		
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("");
        br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).sendKeys("");
		
		br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		
		String msg= br.switchTo().alert().getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "User Name not given!");
		System.out.println("test case passed");
	    br.switchTo().alert().accept();  // for closing the alert 
	    
		}
		
	
}
