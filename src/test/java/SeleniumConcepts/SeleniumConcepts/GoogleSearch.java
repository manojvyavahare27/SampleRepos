package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("Selenium automation");
//		Thread.sleep(3000);
//		List <WebElement> listText=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		System.out.println(listText.size());
//		 
//		for(WebElement e:listText)
//		{
//			String str=e.getText();
//			System.out.println(str);
//			if(str.contains("testing with java"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		ElementUtil Eut=new ElementUtil(driver);
		
		By searchField=(By.name("q"));
		By suggestions=(By.xpath("//div[@class='wM6W7d']/span"));
		googleSearch(searchField, suggestions, "Selenium automation", "testing with java");
		String searchBtnText=Eut.doElementGetText(searchField);
		System.out.println(searchBtnText);
	}
		public static void googleSearch(By searchField, By suggestions, String searchKey, String suggName) throws InterruptedException
		{
			//driver.findElement(By.name("q")).sendKeys("Selenium automation");
			driver.findElement(searchField).sendKeys(searchKey);
			Thread.sleep(3000);
			List <WebElement> listText=driver.findElements(suggestions);
			System.out.println(listText.size());
			 
			for(WebElement e:listText)
			{
				String str=e.getText();
				System.out.println(str);
				if(str.contains(suggName))
				{
					e.click();
					break;
				}
			}
		}
		
	

}
