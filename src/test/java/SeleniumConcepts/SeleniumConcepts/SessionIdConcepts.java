package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdConcepts {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.quit(); //session id get Null after driver.quit.
		
		driver=new ChromeDriver();  //New Session id start after driver open again.
		
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.quit();
		
	}

}
