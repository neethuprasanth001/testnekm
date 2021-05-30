package nekmsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
	  @Test
	  public void openMyBlog() {
		driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		  
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
