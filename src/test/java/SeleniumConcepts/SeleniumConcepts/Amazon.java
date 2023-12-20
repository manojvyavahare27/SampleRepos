package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		System.err.println("Links Count is:"+linksList.size());
		for(WebElement e:linksList)
		{
			String text=e.getText();
			if(text.length()!=0)
			{
			System.out.println(text);
			}
		}
		

	}

}
