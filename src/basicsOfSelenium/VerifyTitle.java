package basicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.godaddy.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Test Pass");
		} else {
			System.out.println("Title Test Fail");
		}
		String expectedUrl="https://in.godaddy.com/";
		String actualUrl=driver.getCurrentUrl();
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL Test Pass");
		} else {
			System.out.println("URL Test Fail");
		}
		driver.close();
	}

}
