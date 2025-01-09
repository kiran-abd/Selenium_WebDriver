package test;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		
		//WebDriver is interface since we cannot create object for interface we ChromeDriver as reference
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		   WebElement LoginLink=driver.findElement(By.linkText("Log in"));
		   
		   LoginLink.click();
		   
		   WebElement Username = driver.findElement(By.name("user_login"));
		   WebElement Password = driver.findElement(By.id("password"));
		   WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		   WebElement RememberBtn = driver.findElement(By.name("rememberMe"));
		   //WebElement Error = driver.findElement(By.id("msg_box"));
		   
		   
		   Username.sendKeys("creatorshashikiran@gmail.com");
		   Password.sendKeys("Reset@334");
		   RememberBtn.click();
		   LoginBtn.click();
		   WebElement Error = driver.findElement(By.id("msg_box"));
		   
		   
		   
		   String ExpectedError = "The email or password you have entered is invalid.";
		   String ActualError = Error.getText();
		   
		   System.out.println(ExpectedError);
		   
		   if(ActualError.equals(ExpectedError)) {
			   
			   System.out.println("Logintest is pass");
		   }
		   
		   else {
			   
			   System.out.println("LoginTest is fail");
		   }
		   
		   
		          List<WebElement>  Links=driver.findElements(By.tagName("a"));
		          
		          System.out.println(Links.size());
		          
		          for(WebElement ele:Links)
		        	  
		        	  
		          {
		        	  System.out.println(ele.getAttribute("href"));
		          }
		   
		  driver.close();
		   
		

	}

}
