package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Example {
	
	public String baseUrl = "https://www.google.com/";
	String driverPath = "./Drivers/chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void BrowserLaunch() throws InterruptedException {
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get(baseUrl);
		Thread.sleep(3000);
		
	}
  @Test
  public void verifyTitle() throws InterruptedException {
	  String expectedTitle ="Google";
	  Thread.sleep(3000);
	  String actualTitle=driver.getTitle();
	  Thread.sleep(3000);
      Assert.assertEquals(actualTitle, expectedTitle);
      Thread.sleep(3000);

  }
  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }
}
