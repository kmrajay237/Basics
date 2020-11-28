package locators_cssSelectors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors_ChildElements {

	public static void main(String[] args) throws Exception {
//		ul[id='automation']>li
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/ChildElements.html");
		List<WebElement> list = driver.findElements(By.cssSelector("ul[id='automation']>li"));
		for (WebElement element : list) {
			String text = element.getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		driver.close();

	}

}
