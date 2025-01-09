package test;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement UserName=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		WebElement Password=driver.findElement(By.xpath("//input [@name='pass']"));
		WebElement LoginButton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		
		UserName.sendKeys("creatorshashikiran@gmail.com");
		Password.sendKeys("reset@321");
		LoginButton.click();
		
	}

}
