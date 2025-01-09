package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		WebElement SignUpBt= driver.findElement(By.xpath("//div[@class=\"_6ltg\"]/a"));
		
		SignUpBt.click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement FirstName= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		WebElement SureName = driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]"));
		WebElement Email = driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]"));
		WebElement PW = driver.findElement(By.xpath("//input[@aria-label=\"New password\"]"));
		
		
		FirstName.sendKeys("Kiran");
		SureName.sendKeys("Ananthram");
		
		String Gender = "Female";
		
		String Xpath= "//label[text()='"+Gender+ "']";
		WebElement gender = driver.findElement(By.xpath(Xpath));
		gender.click();
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@title=\"Month\"]//option"));
		
		
		for(WebElement elm: months) {
			
			System.out.println(elm.getText());
	
		}
		
		List<WebElement> Day= driver.findElements(By.xpath("//select[@name=\"birthday_day\"]//option"));
		
		for(WebElement ele:Day) {
			
			System.out.println(ele.getText());
		}
		
		WebElement currentmonth = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]/option[@selected=\"1\"]"));
		
		System.out.println(currentmonth.getText());
		
		List<WebElement> year = driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select dday = new Select(day);
		dday.selectByVisibleText("27");
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Select mmonth = new Select(month);
		mmonth.selectByVisibleText("Nov");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select yyear = new Select(Year);
		yyear.selectByVisibleText("1993");
		
	
		Email.sendKeys("creatorshashikiran@gmail.com");
		PW.sendKeys("reset@312");
		
		WebElement signup = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		
		signup.click();
		
		
		
		
		
		
		

	}

}
