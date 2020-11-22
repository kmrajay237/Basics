package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/qualitrix/Desktop/vriskh-workspace/Vriksh/LocatorsHtml/ChildElements.html");
		WebElement username = driver.findElement(By.name("n1"));
		WebElement password = driver.findElement(By.name("n2"));
		username.sendKeys("Arya");
		password.sendKeys("test123");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.className("btn"));
		submit.click();
		Thread.sleep(2000);
		driver.close();
	}

}
