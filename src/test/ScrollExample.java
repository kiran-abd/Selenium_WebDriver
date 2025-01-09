package test;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement element  = driver.findElement(By.xpath("//h2[text()='Table Cells']"));
		
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		
		//To scroll to particular element;
		obj.executeScript("arguments[0].scrollIntoView();", element);
		
		
		// To scroll to end of the page.
		obj.executeScript("window.scrollTo(0, document.body.scrollHeight");
		

	}

}
