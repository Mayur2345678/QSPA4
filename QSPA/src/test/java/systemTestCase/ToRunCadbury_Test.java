package systemTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ToRunCadbury_Test {

	@Test(groups ="food")
	public void cadbury() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cadbury.co.uk/products/brands/bournville/");
		Thread.sleep(3000);
		driver.quit();

	}
}
