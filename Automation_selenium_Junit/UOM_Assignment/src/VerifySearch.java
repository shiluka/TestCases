import junit.framework.Assert; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 


public class VerifySearch { 
	private WebDriver driver; 
	private String baseUrl; 
	
	@Before public void setupDriver() { 
		driver = new FirefoxDriver(); 
		baseUrl = "http://www.google.lk"; 
		}
	
	@Test public void runningTest() { 

		driver.get(baseUrl + "/"); 
		WebElement search = driver.findElement(By.name("q")); //Get the search box element by name 
		search.sendKeys("raveen");//Input the searching value ("raveen") in the search box 
		
		//submit the form. WebDriver will find the form from the element
		search.submit();
		
		try { 
			Thread.sleep(2000);//Wait for 2 second otherwise page won't navigate to given web page 
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
			} 
		
		Assert.assertEquals("raveen - Google Search", driver.getTitle());
		
		} 
	
	@After public void stopDriver() { 
		driver.quit(); 
		} 
	
}
			
		
	
	
		