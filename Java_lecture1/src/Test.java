import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
	public static WebDriver driver ;
	
public static String browser="IE";
	
	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\WEBDRIVER\\geckodriver-v0.19.1-win64/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\LENOVO\\Desktop\\WEBDRIVER\\IEDriverServer_x64_3.8.0/IEDriverServer.exe");
		
		if(browser.equals("ff")) {
			driver=new FirefoxDriver();	
			
		} else if(browser.equals("IE")) {
			
			driver=new InternetExplorerDriver();
			
		}else if(browser.equals("chrome")) {
			driver=new FirefoxDriver ();
		}
				
	
		
	driver.get("http://gmail.com");
	System.out.println(driver.getTitle());
	

}
}
