package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetImgAmazon {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		String text=driver.findElement(By.tagName("a")).getText();//.getAttribute("href");
		System.out.println(text);
	}

}
