package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Sleeper;

/**
 * @author Manoj Vyavahare
 */
public class BrowserUtil {

	static WebDriver driver;
	
//	public OpenBrowser(WebDriver driver)
//	{
//		this.driver=driver;
//	}

	/**
	 * 
	 * @param browser
	 * @return the driver instance
	 */
	public WebDriver launchBrowser(String browser) {
		//String browser = "chrome";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Enter Correct browser name");
			break;
		}
		return driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void launchURL(String url)
	{
		if(url.equals(null))
		{
			System.out.println("URL is Null");
		}
		if(url.indexOf("http")==0)
		{
			driver.get(url);
		}
		else
		{
			System.out.println("Http is missing");
		}
		
	}
	
	/**
	 * Get Page Title
	 * @return Title of the page
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		return title;
	}
	
	
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url is : " + url);
		return url;
	}
	
	
	public boolean getPageSource(String value) {
		String pageSource = driver.getPageSource();
		if(pageSource.contains(value)) {
			return true;
		}
		return false;
	}
	/**
	 
	 * 
	 */
	public void closeBrowser()
	{
		driver.close();
		
	}
	
	/**
	 * 
	 */
	public void quit()
	{
		driver.quit();
	}

}
