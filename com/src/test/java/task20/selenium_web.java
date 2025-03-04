package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_web {
	
	public static void main(String args[]) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		WebElement date =driver.findElement(By.id("datepicker"));
		
		date.click();
		
		driver.findElement(By.xpath("//div//table//tbody//tr//td//a[text()='22']")).click();
		
		System.out.println(date.getAttribute("value"));
		
		driver.quit();
	}

}
