import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\eclipse-workspace\\SeleniumRegularSetup\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/");
		//BoostStrap Alert
		Thread.sleep(2000);
		driver.findElement(By.linkText("No, thanks!")).click();
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(2000);
		//Java Script Alert Box
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert box text :" + text);
		Thread.sleep(2000);
		alert.accept();
		//Java Script Confirm Box
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		text = alert.getText();
		System.out.println("Confirm box text :" + text);
		alert.dismiss();
		//Java Script Promote Box
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		alert.sendKeys("Rupesh");
		Thread.sleep(3000);
		text = alert.getText();
		System.out.println("prompt box text :" + text);
		alert.accept();
		driver.quit();
		
	}
}