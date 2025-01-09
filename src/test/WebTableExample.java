package test;


import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		
		List<WebElement> TBRows = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		
		System.out.println("Total no of rows in the table is "+ TBRows.size());
		
		
		List<WebElement> TBColumn = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr/th"));
		
		System.out.println("Total no of columns in the table is "+ TBColumn.size());
		
		
		
		List<WebElement> THrow = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td"));
		
		
		for(WebElement elm:THrow) {
			
			System.out.println(elm.getText());
		}
		
		List<WebElement> FirstCol = driver.findElements(By.xpath("//table[@id=\"customers\"]//td[1]"));
		
		for(WebElement ele: FirstCol) {
			
			System.out.println( ele.getText());
			
		}
		
		
		
		
		
		

	}

}
