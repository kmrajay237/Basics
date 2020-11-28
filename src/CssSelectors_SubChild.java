package locators_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors_SubChild {

	public static void main(String[] args) throws Exception {
//		div[id='textboxes']>div>input
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/ChildElements.html");
		WebElement username = driver.findElement(By.cssSelector("div[id='textboxes']>div>input"));
		username.sendKeys("Emilia Clarke");
		Thread.sleep(3000);
		driver.close();
	}

}
