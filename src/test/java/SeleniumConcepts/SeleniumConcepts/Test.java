package SeleniumConcepts.SeleniumConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://testcellma.com/cellmaUser/login");
		String str=driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 css-1ms2jaf']")).getText();
		if(str.equals("Please Login Here"))
		{
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("trainer.Dhanu");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		}
		driver.quit();
				
	}

}
