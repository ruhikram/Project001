package test101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium101 {
	
	public static void vijay() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice/");
		
		
		WebElement frstName = driver.findElement(By.id("firstname"));
		frstName.sendKeys("Ruhi");
		
		WebElement lastName = driver.findElement(By.className("lastname"));
		lastName.sendKeys("Saifi");
		
		WebElement genderResult = driver.findElement(By.name("gender"));
		genderResult.click();
		
		WebElement language = driver.findElement(By.name("language_java"));
		language.click();
		
		driver.findElement(By.linkText("Click Me to open New Window")).click();
		
		
		driver.findElement(By.linkText("Click Me to get Alert")).click();
		
	}	

	public static void main(String[]args) throws InterruptedException{
		vijay();
	}
}
