package basicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAndCloseBrowser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://in.godaddy.com/");
		driver.navigate().to("https://in.godaddy.com/");
//		driver.close();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		
		driver.navigate().back();//GoDaddy
		Thread.sleep(2000);
		
		driver.navigate().forward();//Selenium
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
