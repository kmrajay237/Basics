package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeTextInWebElement {
//	using id static method in abstract class By
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/text-box");
//		By username = By.id("userName");
//		WebElement user = driver.findElement(username);
			
		
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys("daenarys");
		Thread.sleep(2000);
		driver.close();
	}

}
