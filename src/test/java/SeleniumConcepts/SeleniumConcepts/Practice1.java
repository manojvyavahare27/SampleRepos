package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Manoj Vyavahare
 */
public class Practice1 {
	static WebDriver driver;
	public static void main(String[] args) {

		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 String textURL=driver.getCurrentUrl();
		 System.out.println(textURL);
		 List<WebElement> linkText= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		 System.out.println(linkText.size());
//		 for(int i=0;i<linkText.size();i++)
//		 {
//			 String text=linkText.get(i).getText();
//			 System.out.println(text);
//		 }
		 for(WebElement e:linkText)
		 {
			 String LanguageText=e.getText();
			 System.out.println(LanguageText);
			 if(LanguageText.equals("मराठी"))
			 {
				 
				 e.click();
				 break;
			 }
		 }
	}

}
