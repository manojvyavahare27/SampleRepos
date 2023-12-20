package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeAmazonLang {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By CountryList=By.xpath("//div[@class='list-group']/a");
		String Country="Forgotten Password";
		clickOnElement(CountryList,Country);
	}
	
	public static void clickOnElement(By locator, String country) throws InterruptedException
	{
		List<WebElement> CountryList=driver.findElements(locator);
		int Countrycount=CountryList.size();
		System.out.println(Countrycount);
		for(WebElement e: CountryList)
		{
			String Text=e.getText();
			if(Text.contains(country))
			{
				Thread.sleep(5000);
				e.click();
				break;
			}
		}
	}

}
