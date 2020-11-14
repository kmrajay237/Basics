package basicsOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangingDimensionOfBrowser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Curent URL is : "+url);
		
//		String pageSource = driver.getPageSource();
//		System.out.println("Page Source is: "+pageSource);
		
		int width=400, height=600;
		Dimension dim=new Dimension(width, height);
		Thread.sleep(3000);
		driver.manage().window().setSize(dim);
		Thread.sleep(3000);
		
		Point p=new Point(width, height);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		driver.quit();
//		driver.close();
	}

}
