package selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Vinita/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","C:/Users/Vinita/Downloads/Selenium udemy/Webdrivers/geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:/Users/Vinita/Downloads/Selenium udemy/Webdrivers/msedgedriver.exe");
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
