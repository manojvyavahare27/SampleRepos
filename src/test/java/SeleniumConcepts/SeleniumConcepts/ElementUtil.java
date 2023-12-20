package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	public String doElementGetText(By locator)
	{ 
		return getElement(locator).getText();
		
	}
	public String doGetElementAttribute(By locator, String attrName)
	{
		return getElement(locator).getAttribute(attrName);		
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public By getBy(String locatorType, String locatorValue) {
		By by = null;
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			by = by.id(locatorValue);
			break;
		case "name":
			by = by.name(locatorValue);
			break;
		case "css":
			by = by.cssSelector(locatorValue);
			break;
		case "class":
			by = by.className(locatorValue);
			break;
		case "xpath":
			by = by.xpath(locatorValue);
			break;
		case "linktext":
			by = by.linkText(locatorValue);
			break;
		case "partialLinkText":
			by = by.partialLinkText(locatorValue);
			break;
		case "tag":
			by = by.tagName(locatorValue);
			break;

		default:
			System.out.println("Wrong locator type is passed");
			AutomationException("Wrong locator type");
			return by;
		}
		return by;

	}

	private void AutomationException(String string) {
		// TODO Auto-generated method stub
		
	}
}
