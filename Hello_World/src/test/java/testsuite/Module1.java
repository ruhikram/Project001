package testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import dsutilities.LoggerLoad;

public class Module1 {
	@Test
	public void BeforeStart() {
	//System.out.println("Print before class");
	LoggerLoad.info("Print by logger");	
	}
	
	@AfterClass
	public void AfterStart() {
	System.out.println("Print after class");	
	}
	@BeforeSuite
	public void BeforeS() {
	System.out.println("Print before suit");
	}
	@AfterSuite
	public void AfterS() {
	System.out.println("Print after suit");	
	}
	
	int a = 48;
	int b = 12;
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("execute before method");
			
		}
	
	@BeforeTest
	public void beforeTest() {
	System.out.println("execute before Test");
	}
	@Test
	public void dividenumbers() {
		
		int answer= a/b;
	System.out.println("Answer is " + answer);	
			}
	@Test(groups = {"smoke","sanity"})
	public void multiplynumbers() {
		int ans=a*b;
		System.out.println("Answer is " + ans);	
			}
	@Test
	public void avenumbers() {
		int ave=(a+b)/2;
		System.out.println("Average is " + ave);
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
	System.out.println("execute after Test");
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("execute after method");
}
}
