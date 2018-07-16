package amazonproject;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import java.io.*;

public class Amazonclass {

	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'ap_email')]")).sendKeys("9880461409");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'ap_password')]")).sendKeys("1qaz!QAZ");
		driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).click();
		driver.findElement(By.xpath("//*[contains(@id,'twotabsearchtextbox')]")).sendKeys("pendrive");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		//driver.findElement(By.xpath(".//*[@id='result_6']/div/div[3]/div[1]/a/h2")).click();
		
		WebElement element= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath(".//*[@id='nav-item-signout-sa']/span")).click();
		driver.close();
	
	
		//driver.findElement(By.xpath("//span[text()='Not Rahul? Sign Out']")).click();
		
		
	}

}
