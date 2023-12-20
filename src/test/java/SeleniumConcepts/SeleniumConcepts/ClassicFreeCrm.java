package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicFreeCrm {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.get("https://classic.freecrm.com/index.html");
		 driver.findElement(By.name("username")).sendKeys("apiautomation");
		 driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();

		 driver.switchTo().frame("mainpanel");
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("CONTACTS")).click();
		 //driver.findElement(By.xpath("//a[text()='Joe Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		 clickOnCheckbox("neha sharma");
		 
		 List <WebElement> listitems=driver.findElements(By.xpath("//a[text()='neha sharma']/parent::td/following-sibling::td"));
		 for(WebElement e: listitems)
		 {
			 String text=e.getText();
			 System.out.println(text);
		 }
	}

	public static void clickOnCheckbox(String username)
	{
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
}
