import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Findelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\WEBDRIVER\\geckodriver-v0.19.1-win64/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://gmail.com");
		WebElement element =driver.findElement(By.id("identifierId"));
		element.sendKeys("hoga.hitesh@gmail.com");
		element =driver.findElement(By.id("identifierNext"));
		element.click();
		element =driver.findElement(By.id("password"));
		element.sendKeys("30081978");
		
	}

}

