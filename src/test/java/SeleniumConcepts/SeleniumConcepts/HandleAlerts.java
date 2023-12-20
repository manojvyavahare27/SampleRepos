package SeleniumConcepts.SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
     Alert alert=driver.switchTo().alert();
     Thread.sleep(1000);
     String message=alert.getText();
     System.out.println(message);
     Thread.sleep(1000);
     alert.accept();
     driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
     Thread.sleep(1000);
     alert.dismiss();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
     Thread.sleep(1000);
     alert.dismiss();
     //driver.close();
	}

}
