package locators_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors_TagAndClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/ChildElements.html");
		WebElement username = driver.findElement(By.cssSelector("input#a1"));
		username.sendKeys("Emilia Clarke");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.cssSelector("input.c2"));
		password.sendKeys("Zxcv@1234");
		Thread.sleep(3000);
		driver.close();

	}

}
