package systemTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TolunchSamsung_Test {

	@Test(groups ="phonebrand")
	public void samsung() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/computers/galaxy-book/galaxy-book4-pro/buy/");
		Thread.sleep(3000);
		driver.quit();

	}
}
