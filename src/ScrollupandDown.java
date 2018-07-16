import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollupandDown {


	@Test
	public void Scrolling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(2500,-2500)");
		System.out.println("scrolled up");
	}
	
	
	
}
