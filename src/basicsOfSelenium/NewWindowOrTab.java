package basicsOfSelenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowOrTab {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> handles = driver.getWindowHandles();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.godaddy.com/");
		Thread.sleep(3000);
		
//		driver.quit();
		driver.close();
		Thread.sleep(3000);
		for (String id : handles) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			driver.close();
		}
	}

}
