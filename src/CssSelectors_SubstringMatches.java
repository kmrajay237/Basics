package locators_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors_SubstringMatches {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/ChildElements.html");
		WebElement link = driver.findElement(By.cssSelector("a[href*='book']"));
//		a[href^='https://']
//		a[href$='book.com/']
//		a[href*='book']
		link.click();
		Thread.sleep(3000);
		driver.close();

	}

}
