package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingtagName {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/TagName.html");
		WebElement username = driver.findElement(By.tagName("input"));
		username.sendKeys("Emilia");
		Thread.sleep(4000);
		
		WebElement link1 = driver.findElement(By.linkText("Google India"));
		link1.click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		WebElement link2 = driver.findElement(By.partialLinkText("gle In"));
		link2.click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
