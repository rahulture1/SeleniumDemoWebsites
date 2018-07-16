import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {

	@Test
	public void DClick() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
		Actions action=new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath(".//*[@id='post-body-7297556448793668582']/div[1]/button"))).build().perform();
		
		
	}
	
	
}
