package testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module2 {
	@BeforeClass
	public void BeforeStart() {
	System.out.println("Print before class");
	
	}
	
	@AfterClass
	public void AfterStart() {
	System.out.println("Print after class");	
	}
	
	int n = 18;
	int m = 25;
	int sum;
	
	@Test
	public void calculatesum() {
	sum = (n + m);
		
	System.out.println("answer is " + sum);	
		}
	@Test 
	public void greaternumber() {
		
		if(m>n) {
		System.out.println(" m is greater");	
			
		}
		else {
			
			System.out.println("n is greater");
		}
	
		
		}
	@Test
	public void printnumbers() {
		
		for(int i=18; i<=25; i++) {
			System.out.println("i value is :" +i);
		}
		}
	@DataProvider
	public Object[][] testing1(){
		Object[][] data = {{"ram","80"},{"shyam","95"}};
		return data;
	}
	@Test (dataProvider = "testing1")
	public void marks(String name,String marks) {
		System.out.println(name +"and"+marks);
	}
	
	
	}
  
			
