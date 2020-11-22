package basicsOfSelenium;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullPageScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/text-box");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Date date=new Date();
//		FileUtils.copyFile(srcFile,new File("./img/fullpage.png"));
		driver.close();
	}

}
