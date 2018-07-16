import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class UploadFile {
@Test
	public void uploaddoc() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.xpath(".//*[@id='uploadfile_0']"));
		upload.sendKeys("E:\\sample.txt");
		driver.findElement(By.xpath(".//*[@id='terms']")).click();
		driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
	}
}
