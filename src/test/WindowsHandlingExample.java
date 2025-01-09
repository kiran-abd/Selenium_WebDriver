package test;

import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		String parentwind=driver.getWindowHandle();
		
		System.out.println("Before clicking new window"+parentwind);
		
		
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@id=\"windowButtonWrapper\"]/button"));
		
JavascriptExecutor obj = (JavascriptExecutor) driver;
		
		//To scroll to particular element;
		obj.executeScript("arguments[0].scrollIntoView();", ele);
		
		ele.click();
		
		Set<String> handles=  driver.getWindowHandles();
		
		        Iterator<String> itr=handles.iterator();
		        
		        
		        
		        while(itr.hasNext()) {
					
					String currentVal = itr.next();
					System.out.println(currentVal);
					
					
					if(!currentVal.equals(parentwind)) {
						
						
						driver.switchTo().window(currentVal);
					
					}
					
					
				}
		        WebElement element  = driver.findElement(By.xpath("//h1[text()=\"This is a sample page\"]"));
				
				System.out.println(element.getText());
		        driver.close();
		        
		        driver.switchTo().window(parentwind);
	}
	
	

		   
		        
		        
		        
		        

	}


