package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		List<WebElement> Sugg=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		int count=Sugg.size();
		System.out.println(count);
		for(WebElement e:Sugg)
		{
			String Text=e.getText();
			System.out.println(Text);
		}
		

	}

}
