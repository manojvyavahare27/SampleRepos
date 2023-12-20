package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
//		driver.get("https://testcellma.com/cellmaUser/login");
//		driver.get("http://10.0.0.64:3000/cellmaUser/login");
		
		driver.navigate().to("https://testcellma.com/cellmaUser/login");
		driver.navigate().to("http://10.0.0.64:3000/cellmaUser/login");
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
