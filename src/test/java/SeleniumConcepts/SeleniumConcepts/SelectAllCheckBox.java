package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		 List <WebElement>radioButton=driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord')]"));
		 for(WebElement e: radioButton)
		 {
			 e.click();
		 }

		
	}

}
