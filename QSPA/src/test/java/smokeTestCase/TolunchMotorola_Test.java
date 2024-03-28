package smokeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TolunchMotorola_Test {

	@Test(groups ="phonebrand")
	public void motorola() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.motorola.in/");
		Thread.sleep(3000);
		driver.quit();
	}
}
