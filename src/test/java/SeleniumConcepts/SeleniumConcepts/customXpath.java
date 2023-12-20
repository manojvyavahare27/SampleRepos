package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXpath {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
