package frame;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithAnIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\eclipse-workspace\\SeleniumRegularSetup\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])")));
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])")));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Automation Testing");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@id='singleframe'])")));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Rupesh");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
