package test101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialNinja {

	public static void ruhi() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();

		driver.get("http://tutorialsninja.com/demo/index.php");
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
		btn.click();
		
		List<WebElement> elems = driver.findElements(By.xpath("//button[@class='currency-select btn btn-link btn-block']")); 
		elems.get(0).click();

		
		WebElement canon = driver.findElement(By.xpath("//div[@id='content']/div[2]/div[4]/div/div[3]/button[1]"));
		canon.click();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&product_id=30");
		WebElement btnAdd = driver.findElement(By.id("button-cart"));
		btnAdd.click();
		
		WebElement selectRqd = driver.findElement(By.className("text-danger"));
		System.out.println("true");
		System.out.println(selectRqd.getText());
		if (selectRqd.getText() != "")
		{
			System.out.println("There is some error");
			
			//Select selectOpt = driver.findElement(By.xpath("//select[@id='input-option226']"));
		}
		
		
		WebElement home = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		home.click();
		
		WebElement iphone = driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div/div[2]/h4/a"));
		iphone.click();
		
		
		WebElement qty = driver.findElement(By.xpath("//input[@id='input-quantity']"));
		qty.clear();
		qty.sendKeys("2");
		
		
		WebElement addCrt = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
		addCrt.click();
		
		System.out.println("Success msg");
		
		
		WebElement cartItem = driver.findElement(By.xpath("//span[@id='cart-total']"));
		cartItem.click();
		
		WebElement viewcart = driver.findElement(By.xpath("//div[@id='cart']/ul/li[2]/div/p/a[1]/strong"));
		viewcart.click();
	}
	public static void main(String[] args) {
		ruhi();
	}	



}
