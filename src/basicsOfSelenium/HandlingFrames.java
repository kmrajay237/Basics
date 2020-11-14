package basicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		WebElement packageListFrame = driver.findElement(By.name("packageListFrame"));
		WebElement firstElement = driver.findElement(By.xpath("//a[contains(text(),'java.applet')]"));
		driver.switchTo().frame(packageListFrame);
		firstElement.click();
		
		Thread.sleep(4000);

	}

}


//https://docs.oracle.com/javase/7/docs/api/