package test101;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hospital_java {

	public static void ruhi() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad.Ikram\\ruhi-workspace\\Hello_World\\src\\test\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");

		for(int i=1; i<=1; i++) {

			WebElement hospName = driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//a"));

			String hName = hospName.getText();

			
			System.out.println("name of the hospital : " + hName);
		

			/*
		// fetch all beds
		List<WebElement> allbed = driver.findElements(By.xpath("//span[@class='count-text']"));
		int sum = 0;
		// fetching each bed from the pool
		for (WebElement totalbed : allbed) {
			System.out.println(totalbed.getText());
			String strBedTxt = totalbed.getText();
			String strBedCt = strBedTxt.substring(13, strBedTxt.length());

			sum = sum + Integer.parseInt(strBedCt);
		}
		System.out.println("Total available bed count is :" + sum);
			
		}
	}

*/

	WebElement availableBeds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[contains(text(),'Total Vacant')]"));
	System.out.println(availableBeds.getText() );
			
	driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[@class='card-header']")).click();
			
	WebElement o2beds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[text()='HDU(O2)']/../div[2]"));
	System.out.println("O2 beds : " + o2beds.getText() );
		
	WebElement ventBeds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[text()='Ventilator']/../div[2]"));
	System.out.println("ventilator Beds : " + ventBeds.getText() );
		
			hospName.click();
			
			Thread.sleep(500);
			
			WebElement address = driver.findElement(By.id("lblhosaddress"));
			System.out.println("Address : " + address.getText() );
		
			WebElement contact = driver.findElement(By.id("lblhosCno"));
			System.out.println("contact : " + contact.getText() );
		
			driver.findElement(By.xpath("//button[@class='close']/span")).click();
			
			Thread.sleep(500);
		}
	}

		
		
		
		 	
	
		
	public static void main(String[] args) throws InterruptedException {
		ruhi();
	}

}
