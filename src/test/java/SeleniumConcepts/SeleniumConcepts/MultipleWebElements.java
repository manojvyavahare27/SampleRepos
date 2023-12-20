package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {

	static WebDriver driver;
	public static void main(String[] args) {
      driver=new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
      
      List <WebElement> texFieldList= driver.findElements(By.xpath("//input[@class='form-control']"));
     // List <WebElement> texFieldList= driver.findElements(By.className("form-control"));
      for(WebElement e: texFieldList)
    	
      System.out.println(texFieldList.size());
		
	}

}
