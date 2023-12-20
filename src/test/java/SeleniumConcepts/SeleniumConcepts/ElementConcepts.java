package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementConcepts {

	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		ElementUtil eleUtil=new ElementUtil(driver);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    By loginBtn=By.xpath("//input[@type='submit']");
		eleUtil.doClick(loginBtn);
		
		//driver = new ChromeDriver();
		
		// #1
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Welcome@123");

		// #2
//		By eid=	By.id("input-email");
//		By pwd=By.id("input-password");
//		driver.findElement(eid).sendKeys("test@gmail.com");
//		driver.findElement(pwd).sendKeys("Welcome@123");

		// #3
//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		WebElement emailID = driver.findElement(eid);
//		WebElement password= driver.findElement(pwd);
//		
//		emailID.sendKeys("test@gmail.com");
//		password.sendKeys("Welcome@123");
		
		
		//#4
//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//		getElement(eid).sendKeys("test@gmail.com");
//		getElement(pwd).sendKeys("Welcome@123");
		
		//#5
//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//		doSendKeys(eid, "test@gmail.com");
//		doSendKeys(pwd, "Welcome@123");
		
		//#6
//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		eleUtil.doSendKeys(eid, "this.@gmail.com");
//		eleUtil.doSendKeys(pwd, "Welcome@123");
//		//brUtil.closeBrowser();
//		System.out.println("Browser closed successfully");
		
		By eid = By.id("input-email");
		By pwd = By.id("input-password");
		eleUtil.doSendKeys(eid, "this.@gmail.com");
		eleUtil.doSendKeys(pwd, "Welcome@123");
		
		String text=eleUtil.doGetElementAttribute(eid, "value");
		System.out.println(text);
		
		
		
		
		
		
			

	}
	
}
