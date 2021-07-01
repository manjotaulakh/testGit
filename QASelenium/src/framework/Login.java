package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	void testcase1() {
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
		
	
		void testcase2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.manage().window().maximize();
		
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
		br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("ghPlanet1");
		br.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		
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
		
			void testcase3() {
    	
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
    			
    			System.out.println("Pass- Entered Password is Wrong");
    			
    		}
    		else {
    			System.out.println("Fail");
    		}
    		
    		br.close();
    	}
			void testcase4() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver br = new ChromeDriver();
			br.manage().window().maximize();
			
			br.get("http://apps.qaplanet.in/hrm/login.php");
			
			br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("ghPlanet1");
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
		void testcase5() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
	   br.manage().window().maximize();
	   WebElement UserName=br.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
	   UserName.sendKeys("qaplanet1");
	   WebElement password=br.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
	   password.sendKeys("Lab1");
	   br.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).click();
		
		
		if(UserName.getText().isEmpty() && password.getText().isEmpty())
			{
			
			System.out.println("testcase Passed for clear button");
		}
		else {
			System.out.println("failed");
		}
		br.close();
	}
	
		void testcase6() {
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
		   void testcase7() {
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
			   
			   br.close();
			}
	 
}


