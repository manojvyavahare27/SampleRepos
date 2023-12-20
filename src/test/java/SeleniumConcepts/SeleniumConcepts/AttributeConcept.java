package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emilID=(By.id("input-email"));
		By pwd=(By.id("input-password"));
		By loginBtn=(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
//		driver.findElement(emilID).sendKeys("tester@gmail.com");
//		driver.findElement(pwd).sendKeys("Welcome@123");
//		driver.findElement(loginBtn).click();
		
		String emailId=driver.findElement(emilID).getAttribute("placeholder");
		String password=driver.findElement(pwd).getAttribute("placeholder");
		System.out.println(emailId+" "+password);
		
		

		
	}

}
