package test101;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLogo {
	
	public static void logo() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");	

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dress" + Keys.ENTER);
	
	driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div[2]/h5/a")).click();
	
	driver.findElement(By.xpath("//p[@id='add_to_cart']/button/span")).click();
	
	//driver.findElement(By.xpath("//div[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
	
	driver.findElement(By.xpath("//div[@id='columns']/div/a")).click();
	
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-SHIRTS" + Keys.ENTER);
	
	driver.findElement(By.xpath("//div[@class='compare']/a")).click();
	
	driver.findElement(By.xpath("//div[@id='columns']/div/a")).click();
	
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Printed dress" + Keys.ENTER);
	
	driver.findElement(By.xpath("//div[@class='compare']/a")).click();
	
	driver.findElement(By.xpath("//div[@id='center_column']/div[1]/div[2]/form/button/span")).click();
	
	driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr[1]/td[2]/div[5]/div/div/a[1]/span")).click();
	
	driver.findElement(By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
	
	
	}
	
	public static void main(String[] args) {
		logo();
	}

}
