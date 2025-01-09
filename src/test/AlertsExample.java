package test;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver,chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		//To accept the alert
		WebElement accept = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		
        JavascriptExecutor obj = (JavascriptExecutor) driver;
		
		//To scroll to particular element;
		obj.executeScript("arguments[0].scrollIntoView();", accept);
		accept.click();
		
		Alert acceptalt=driver.switchTo().alert();
		acceptalt.accept();
		
		
		WebElement element = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
		element.click();
		
		Alert dismalt=driver.switchTo().alert();
		dismalt.dismiss();
		
		WebElement senddata=driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
		senddata.click();
		
		Alert data=driver.switchTo().alert();
		
		data.sendKeys("Kiran");
		data.accept();
		
		
		
		

	}

}
