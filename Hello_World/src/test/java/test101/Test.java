package test101;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void DataStructure() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dsportalapp.herokuapp.com/home");
		
		driver.findElement(By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div/div/div/a")).click();
	
		
		driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		driver.findElement(By.xpath("//textarea[@id='editor']")).sendKeys("print \"hello world\"");
		driver.findElement(By.xpath("//form[@id=\"answer_form\"]/button")).click();
		//driver.navigate().back();
	}
	public static void main(String[] args) {
		DataStructure();
	}
	
}


