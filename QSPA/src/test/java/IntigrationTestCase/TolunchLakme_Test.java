package IntigrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TolunchLakme_Test {

	@Test(groups =" makeupbrand")
	public void lakme() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		Thread.sleep(3000);
		driver.quit();

	}
}


