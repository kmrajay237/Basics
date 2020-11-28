package locators_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors_nthChild {

	public static void main(String[] args) throws Exception {
//		ul#automation li:nth-of-type(1)
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/ChildElements.html");
		WebElement ele = driver.findElement(By.cssSelector("ul#automation li:nth-of-type(3)"));
		String text = ele.getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
	}

}
