package loginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsprac {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\Browsers Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
	//br.get("http://demo.automationtesting.in/Register.html");
		
	br.get("https://www.redbus.in");
		
	/*List<WebElement>nol=br.findElements(By.tagName("a"));     // to find the number of links on the Webpage 
	int n =nol.size();
	System.out.println(n);
	for (int i=0;i<n;i++) {
		System.out.println(nol.get(i).getText());
	}
	
	List<WebElement>noc=br.findElements(By.xpath("//input[@type='checkbox']"));
	int p =noc.size();
	System.out.println(p);
	for ( int i=0;i<noc.size();i++) {
		System.out.println(noc.get(i).getAttribute("value"));
	}*/
	
	List<WebElement>notextboxes=br.findElements(By.xpath("//input[@type='text']"));     // to find the number of textboxes on the Webpage 
	int n =notextboxes.size();
	System.out.println(n);
	System.out.println(notextboxes);
	
	for (int i=0;i<n;i++) {
		System.out.println(notextboxes.get(i).getText());
       }
	
	}

}
