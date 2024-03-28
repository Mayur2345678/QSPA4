package systemTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TolunchSugar_Test {

	@Test(groups ="makeupbrand")
	public void sugar() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/collections/lipsticks");
		Thread.sleep(3000);
		driver.quit();
	}
}
