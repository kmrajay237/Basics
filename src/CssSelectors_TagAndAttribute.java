package locators_cssSelectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors_TagAndAttribute {

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
		
		WebElement submit = driver.findElement(By.cssSelector("button[class='btn']"));
//		button[id='submit']
//		button[type='button']
//		button[class='btn']
		submit.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();  // Transfers control to popup
		alert.accept();  //Clicks on OK button
		Thread.sleep(3000);
		driver.close();
	}

}
