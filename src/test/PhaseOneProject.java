package test;

import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhaseOneProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement input = driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]"));
		
		input.sendKeys("iphone 16");
		
		
		
		WebElement search=driver.findElement(By.xpath("//div[@class=\"nav-right\"]/div/span/input"));
		search.click();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		List<WebElement> productlist=driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]"));
		List<WebElement> pricelist=driver.findElements(By.xpath("//span[@class=\"a-price\"]"));
		
		
		
		System.out.println("Total count is"+productlist.size());
		
		for(int count=0; count<productlist.size()-1; count++) {
			
			System.out.println(" "+productlist.get(count).getText()+ " " + pricelist.get(count).getText());
			
			
		}
		
		

		
		
		
	}

}
