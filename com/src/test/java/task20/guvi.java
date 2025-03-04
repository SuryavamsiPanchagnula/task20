package task20;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class guvi {
	
	public static void main(String args[]) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		
		try {
		
		driver.get("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		WebElement name = driver.findElement(By.id("name"));
		
		name.sendKeys("Testing User");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("Testing_vamsi@gmail.com");
	
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("vamsi@2000");
		
		WebElement phonenumber = driver.findElement(By.id("mobileNumber"));
		
		phonenumber.sendKeys("9347812000");
		
		WebElement signup = driver.findElement(By.id("signup-btn"));
		
		signup.click();
		
		/*
		
		WebElement currentprofile = driver.findElement(By.id("profileDrpDwn"));
		
		Select current_profile_dropdown = new Select(currentprofile);
		
		current_profile_dropdown.selectByValue("Working professional in IT");
		
		WebElement degree = driver.findElement(By.id("degreeDrpDwn"));
		
		Select degree_dropdown = new Select(degree);
		
		degree_dropdown.selectByValue("B.E. / B.Tech. Computer Science");
		
		WebElement year = driver.findElement(By.id("year"));
		
		year.sendKeys("2021");*/
		
		WebElement may_be_later = wait.until(ExpectedConditions.elementToBeClickable(By.id("laterBtn")));
		
		may_be_later.click(); 
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='left-head']")));
			System.out.println("Registration Success");
		}
		catch(Exception e) {
			System.out.println("Fail to Register");
		}
		
		Thread.sleep(10000);
		
		driver.get("https://www.guvi.in/");
		
		WebElement login = driver.findElement(By.id("login-btn"));
		
		login.click();
		
		WebElement email_login = driver.findElement(By.id("email"));
		
		email_login.sendKeys("Testing_vamsi@gmail.com");
		
		WebElement password_login = driver.findElement(By.id("password"));
		
		password_login.sendKeys("vamsi@2000");
		
		WebElement sign_in=driver.findElement(By.id("login-btn"));
		
		sign_in.click();
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']")));
			System.out.println("Login Success");
		}
		catch(Exception e) {
			System.out.println("Login Failed");
		}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			driver.close();
		}
	}

}
