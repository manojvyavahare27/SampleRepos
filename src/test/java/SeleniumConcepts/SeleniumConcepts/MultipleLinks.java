package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Manoj Vyavahare
 */
public class MultipleLinks {

	static WebDriver driver;
	public static void main(String[] args) {
      driver=new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
      List<WebElement> linksList=driver.findElements(By.tagName("a"));
      System.out.println(linksList.size());     
      for(int i=0;i<linksList.size();i++)
      {
    	  String text=linksList.get(i).getText();
    	  if(text.length()!=0)
    	  {
    		  System.out.println(text);
    	  }   	  
      }
	}

}
