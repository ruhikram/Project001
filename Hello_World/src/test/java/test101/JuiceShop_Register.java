package test101;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JuiceShop_Register {
/*public static void Shop() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://juice-shop.herokuapp.com/#/register");
		
		driver.findElement(By.xpath("//button[@id='navbarAccount']/span[1]/span")).click();	
		
		driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]")).click();
		
		WebElement textArea = driver.findElement(By.id("emailControl"));
		textArea.sendKeys("ruhikram@gmail.com");	
		
		WebElement password  =   driver.findElement(By.id("passwordControl"));
		password.sendKeys("ju!(e$h0p");
		
		WebElement repPassword  =   driver.findElement(By.id("repeatPasswordControl"));
		repPassword.sendKeys("ju!(e$h0p");
		
		
		driver.findElement(By.xpath("//div[@id='mat-select-value-1']/span")).click();
		driver.findElement(By.xpath("//span[text()=' Your eldest siblings middle name? ']")).click();
		//driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div[2]")).click();
		//driver.findElement(By.xpath("//div[@id='mat-select-value-3']/span")).click();
		//driver.findElement(By.xpath("//mat-select[@id='mat-select-2']/div/div[2]")).click();
		
	//driver.findElement(By.xpath("//div[@id='registration-form']/div[1]/mat-form-field[1]/div/div[1]")).click();
	//driver.findElement(By.xpath("//div[@id='registration-form']/div[1]/mat-form-field[1]/div/div[1]/div[3]/span")).click();
		
		
		//WebElement d = driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c119-10']"));*/
		
	
	
	public static WebDriver driver = new ChromeDriver();
	String URL = "https://juice-shop.herokuapp.com/#/register";
	
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By emailID = By.id("emailControl");
	By passwordTxt = By.id("passwordControl");
	By confirmPassword = By.id("repeatPasswordControl");
	By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
	By secQn = By.xpath("//span[text()=' Your eldest siblings middle name? ']");
	By secQnAns = By.id("securityAnswerControl");
	
    @test
	public void register() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
		driver.findElement(dismissBtn).click();
		driver.findElement(emailID).sendKeys("vijay@bharathi.com");
		driver.findElement(passwordTxt).sendKeys("bharathi.1234");
		driver.findElement(confirmPassword).sendKeys("bharathi.1234");
		driver.findElement(secQnBox).click();
		driver.findElement(secQn).click();
		driver.findElement(secQnAns).sendKeys("vijay");
	}
	
}
	
	/*public static void main(String[] args) {
		
	Shop();
	}*/


