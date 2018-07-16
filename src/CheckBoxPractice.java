import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class CheckBoxPractice {

	@Test
	public void chkboxAndScreenshot() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		//driver.findElement(By.xpath(".//*[@id='3f26cd14']/span/div/div[1]/a/img")).click();
		
		WebElement option1=driver.findElement(By.xpath(".//*[@id='u_0_b']"));
		
		
		if(option1.isSelected()) {
		
		
		System.out.println("Checkbox Already Checked ON");
		}
		else {
			
			option1.click();
			System.out.println("Check box Toggled OFF and Clicked");
			
		}
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\screenb.jpeg"));
		System.out.println("Saved the screenshot");
		
	}
	
}
