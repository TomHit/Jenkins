package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;


public class MultipleTestCases {
@Test
public void Verifytitle() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\WEBDRIVER\\geckodriver-v0.19.1-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();	
    driver.get("https://www.gmail.com");
    String title = driver.getTitle();
    Assert.assertEquals(title,"Gmail");
    




}
	
	
	
}
