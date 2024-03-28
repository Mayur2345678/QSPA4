package IntigrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TolunchLorealparis_Test {

	@Test(groups = "hairbrand")
	public void lorealparis() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lorealparis.co.in/");
		Thread.sleep(3000);
		driver.quit();

	}
}



