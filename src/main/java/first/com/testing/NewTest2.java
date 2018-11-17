package first.com.testing;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;



public class NewTest2 {
	
	public WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\dhana\\selinum\\WebDrivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://qa.cmnetwork.co");
	}
	@Test(priority = 1)
	public void Login(){
		String username = "qauser8@edcast.com";
		String password = "QApass8!";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class='button-loader' and text()='Log In']")).submit();
	}
	@Test(priority = 2)
	public void CreateCard() {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//SPAN[text()='label'])[1]")).click();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement hoverOne=driver.findElement(By.xpath("(//SPAN[text()='label'])[1]"));
		WebElement clickWb=driver.findElement(By.xpath("(//SPAN[text()='label'])[1]"));
		
		
		HoverAndClick(driver,hoverOne,clickWb);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		hoverOne=driver.findElement(By.xpath("//button[@aria-label='Smart card' and @type='button']"));
		clickWb=driver.findElement(By.xpath("//button[@aria-label='Smart card' and @type='button']"));
		
		HoverAndClick(driver,hoverOne,clickWb);		
		//driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[1]/button")).click();
		//driver.findElement(By.xpath("//button[@class='create-item-redesign' and aria_label()='Smart card']")).click();
	
	}
	
	public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	/*@Test(priority = 3)
	public void Pathways() {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//SPAN[text()='label'])[1]")).click();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement hoverOne=driver.findElement(By.xpath("(//SPAN[text()='label'])[2]"));
		WebElement clickWb=driver.findElement(By.xpath("(//SPAN[text()='label'])[2]"));
		
		
		HoverAndClick(driver,hoverOne,clickWb);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		hoverOne=driver.findElement(By.xpath("//button[@aria-label='pathway' and @type='button']"));
		clickWb=driver.findElement(By.xpath("//button[@aria-label='pathway' and @type='button']"));
		
		HoverAndClick(driver,hoverOne,clickWb);		
		//driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[1]/button")).click();
		//driver.findElement(By.xpath("//button[@class='create-item-redesign' and aria_label()='Smart card']")).click();
	
		
	}*/

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
