import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void Login() throws InterruptedException, Throwable {

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//a[@class='login']")).click();
	driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("ap.math90@gmail.com");
	driver.findElement(By.xpath(".//input[@id='passwd']")).sendKeys("pqu772_90");
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//button[@id='SubmitLogin']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(".//a[@title='Women']")).click();
	
	/*Actions action=new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//img[contains(@title,'Faded Short Sleeve T-shirts')]"));
	action.moveToElement(element).perform();*/
	
	driver.findElement(By.xpath("(//a[contains(@class,'product-name')])[2]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//[@id='add_to_cart']/button")).click();
	
	
	
	
	
	}
}