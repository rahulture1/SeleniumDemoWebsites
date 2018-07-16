import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class Gmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.xpath(".//a[@id='gb_70']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahul.a.ture@gmail.com");
		driver.findElement(By.xpath(".//input[@id='next']")).click();
		
		
	}
}

                       




