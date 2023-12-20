package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionConcepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.DOWN).perform();
		
		act.scrollToElement(driver.findElement(By.linkText("Help")))
		.click(driver.findElement(By.linkText("Help"))).build().perform();
	}

}
