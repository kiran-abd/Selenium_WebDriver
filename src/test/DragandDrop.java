package test;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement from = driver.findElement(By.xpath("//li[@id=\"credit2\"]/a"));
		
		WebElement to =  driver.findElement(By.xpath("//ol[@id=\"bank\"]/li"));
		
		//Actions class is used to interact with browser like drag and drop, double click, right click and etc
		Actions act = new Actions(driver);
		
		act.dragAndDrop(from, to).build().perform();
		
		

	}

}
