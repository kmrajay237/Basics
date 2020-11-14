package basicsOfSelenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindoAndTabwhandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String handle = driver.getWindowHandle();
		System.out.println("Main Browser ID: "+handle);
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Set ID: "+handles);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
