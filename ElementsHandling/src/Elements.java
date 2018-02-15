
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Elements {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
//Return/capture value from edit box.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\WEBDRIVER\\geckodriver-v0.19.1-win64/geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("quality");
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
	    //driver.close();
	    
	    
// Get the image name
	 //WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
		
//get the image button value
		
	driver.get("http://newtours.demoaut.com");
	System.out.println(driver.findElement(By.name("login")).getAttribute("value"));
	
//click on image button
	driver.get("http://seleniumhq.org");
//check link exist or not
	boolean e = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).isDisplayed();
	if(e==true) {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).click();
	}else {
		System.out.println("LINK IS NOT FOUND");
	}

	
//handle link
	
	driver.get("http://www.google.com");
	//driver.findElement(By.className("gb_P")).click();
//or 
	//driver.findElement(By.linkText("Gmail")).click();
	
// using partial text
	//driver.findElement(By.partialLinkText("Gma")).click();
//using css selector
	//driver.findElement(By.cssSelector("div.gb_Q:nth-child(1) > a:nth-child(1)")).click();
	
//try with xpath
	driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
	
//handle radio button
	
driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=irr3ou6que8510rskafr9k6ha4");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();

// handle drop down box
//driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=irr3ou6que8510rskafr9k6ha4");
Select dropDown=new Select (driver.findElement(By.name("country")));
//dropDown.selectByIndex(3);
dropDown.selectByVisibleText("Angola");// select by value

//count the items in drop down.

List<WebElement> COUNT = dropDown.getOptions();
System.out.println("items count in dropdown is:"+COUNT.size());
//handle checkbox
driver.findElement(By.name("newsletter")).click();
	
//Handle Frames

/*Navigation:

> Launch the page 
> Switch to 3rd frame
> Operate an element
> Back to Top window
> Switch to 1st frame
> Operate an element
*/	
	
	
driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
//Switch to 3rd frame,
Thread.sleep(3000);

//driver.switchTo().frame(2);//frame index
driver.switchTo().frame("classFrame");//by frame name
driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();

//switch from frame to top window
driver.switchTo().defaultContent();

// now select the 1st frame and click the element
driver.switchTo().frame(0);
driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();

//Handle Mouse hover
//*********************************************************
/*driver.get("https://www.carmax.com/");
driver.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/div[2]/ul/li[2]/a")).click();
driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div/ul/li[2]/a")).click();*/

//driver.get("http://toolsqa.com/");
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[4]/a/span[1]/span/span")).click();
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[4]/ul/li[1]/a/span[1]/span/span")).click();

driver.get("http://store.demoqa.com/");

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement element = driver.findElement(By.linkText("Product Category"));

Actions action = new Actions(driver);

action.moveToElement(element).build().perform();

driver.findElement(By.linkText("iPads")).click();

driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
driver.findElement(By.xpath("//*[@id=\"new-account-btn\"]")).click();
//driver.findElement(By.cssSelector("div.control:nth-child(6) > div:nth-child(1) > input:nth-child(1)")).sendKeys("aa");
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("Hitesh");
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("hoga.hitesh@gmail.com");
driver.findElement(By.cssSelector("#registration-form > div:nth-child(5) > div:nth-child(1) > input:nth-child(1)")).sendKeys("30081978");
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/form/div[5]/div/button")).click();

//Handle duplicate objects like password shows 2 times in www.infibeam.com.


	}
	
	
	
	

}
