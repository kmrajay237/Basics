package basicsOfSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingDimensionOfScreen {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		int width = driver.manage().window().getSize().getWidth(); //X-Axis
		int height = driver.manage().window().getSize().getHeight(); //Y-Axis
		
		System.out.println("Height: "+height+" "+"Width: "+width);
		
		
//		Dimension dim=new Dimension(100,200);
		driver.manage().window().setSize(new Dimension(100,200));
		
		driver.manage().window().getPosition().getX();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
