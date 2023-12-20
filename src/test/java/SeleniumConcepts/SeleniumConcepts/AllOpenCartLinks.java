package SeleniumConcepts.SeleniumConcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllOpenCartLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> linksText=driver.findElements(By.className("list-group-item"));
		    int count=linksText.size();
		    System.out.println(count);
		    ArrayList<String> actList=new ArrayList<String>(Arrays.asList("New","Register","Forgotten Password", "My Account", "Address Book", "Wish List", "Order History", "Downloads", "Recurring payments", "Reward Points", "Returns", "Transactions", "Newsletter"));
		    ArrayList<String> expList=new ArrayList<String>();
		    for(WebElement e: linksText)
		    {
		    	String Text=e.getText();
		    	System.out.println(Text);
		    	expList.add(Text);		 
		    	
		    }
		    
		    System.out.println("Expexted List is:"+expList);
		    
		    

	}

}
