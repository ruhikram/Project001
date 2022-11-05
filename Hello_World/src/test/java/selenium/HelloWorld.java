package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void vijay() {

	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textArea = driver.findElement(By.id("ta1"));
		textArea.sendKeys("text box is here");	
		
		WebElement  radioOption  = driver.findElement(By.id("radio2"));
		radioOption.click();
		
		WebElement checkbox  = driver.findElement(By.id("checkbox2"));
		checkbox.click();
		
	}
	

	public static void main(String[]args) throws InterruptedException{
		vijay();
	}
}