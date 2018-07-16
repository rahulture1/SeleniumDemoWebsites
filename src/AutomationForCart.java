
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationForCart {

	
	WebDriver driver= new ChromeDriver();
	
	
	@BeforeTest
	public void start() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		Thread.sleep(1000);		
		
		driver.findElement(By.xpath(".//a[@class='login']")).click();
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("ap.math90@gmail.com");
		driver.findElement(By.xpath(".//input[@id='passwd']")).sendKeys("  password");
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("E:\\Selenium\\screenshot1.png"), true);	
		
		
	}
	
	@Test
	public void Login()throws InterruptedException, Throwable {
		
		
		driver.findElement(By.xpath(".//button[@id='SubmitLogin']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath(".//a[@title='Women']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@id='layered_category_4']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//div[@class='right-block']//a[contains(@title,'Faded Short Sleeve T-shirts')]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//p[@id='add_to_cart']//button[@name='Submit']")).click();
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//button[@name='processAddress']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//input[@id='cgv']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(".//input[@id='cgv']")).click();
		driver.findElement(By.xpath(".//button[@name='processCarrier']")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//a[contains(@title,'Pay by bank wire')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='cart_navigation']/button")).click();
		
			
	}
	@AfterTest
	public void quit() {
		
		driver.quit();
	}
}
