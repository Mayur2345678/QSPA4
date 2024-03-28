package IntigrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_demo_001_Test {

	@Test
	public void run() throws InterruptedException {
		String url = System.getProperty("url");
		System.out.println(url);
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
        driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}
}
