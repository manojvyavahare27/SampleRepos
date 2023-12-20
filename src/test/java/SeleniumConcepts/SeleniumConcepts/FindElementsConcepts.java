package SeleniumConcepts.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String fName=driver.findElement(By.xpath("//input[@name='firstname']/../../label[text()='First Name']")).getText();
		System.out.println(fName);
//		List <WebElement> listTextBox=driver.findElements(By.className("form-control"));
//		System.out.println(listTextBox.size());
//		for(WebElement e:listTextBox)
//		{
//			String text=e.getText();
//			System.out.println(text);
//		}
		

	}
	
	

}
