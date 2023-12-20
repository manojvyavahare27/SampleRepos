package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 String text=js.executeScript("document.documentElement.innerText").toString();
		 System.out.println(text);
		

	}

}
