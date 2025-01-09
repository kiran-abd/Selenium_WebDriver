package test;


import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement File=driver.findElement(By.xpath("//input[@name=\"uploadfile_0\"]"));
		
		File.sendKeys("C:\\Fileupload.txt");
		
		WebElement tc = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		
		tc.click();
		
		WebElement submit = driver.findElement(By.xpath("//button[@id=\"submitbutton\"]"));
		submit.click();
		
		
		TakesScreenshot obj = (TakesScreenshot)driver;
		File file=obj.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
