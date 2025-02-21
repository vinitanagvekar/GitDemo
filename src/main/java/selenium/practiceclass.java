package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class practiceclass {
	
	
	@AfterTest
	public void test1(){
		System.out.println("Hello");
	}
	
	@Test
	public void test2(){
		System.out.println("how are you?");
	}

//	public static void main(String[] args) throws InterruptedException, IOException {
//		System.getProperty("Webdriver.chrome.driver",
//				"C://Users//Vinita//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
	//	driver.get("https://rahulshettyacademy.com/angularpractice/");
//		List<WebElement> ele = driver.findElements(By.xpath("//div//tbody//td[1]"));
//		List<String> price;
//		List<String>orilist = ele.stream().map(s -> s.getText()).collect(Collectors.toList());
//		//driver.findElement(By.xpath("//div//thead//th[1]")).click();
//		List<String> newlist = orilist.stream().sorted().collect(Collectors.toList());
//		
//		do {
//			List<WebElement> rows = driver.findElements(By.xpath("//div//tbody//td[1]"));
//
//		price = rows.stream().filter(s -> s.getText().contains("Beans")).map(s-> getPrice(s)).collect(Collectors.toList());
//		price.forEach(a -> System.out.println(a));
//		if(price.size()<1)
//		{
//			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
//		}
//		}while(price.size()<1);
//		Assert.assertFalse(orilist.equals(newlist));

//		int count = ele.size();
//		for(int i=0;i<count;i++) {
//		System.out.println(driver.findElements(By.xpath("//div//tbody//td[1]")).get(i).getText());
//		}
//		System.out.println("\n");
//		
//		
//		
//		
//		driver.findElement(By.xpath("//div//thead//th[1]")).click();
//		for(int i=0;i<count;i++) {
//			System.out.println(driver.findElements(By.xpath("//div//tbody//td[1]")).get(i).getText());
//			}

//	}
//
//	private static String getPrice(WebElement s) {
//		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
//		return value;
//	}

		//
//	List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
//	for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i).getText());
//
//	}
//	driver.findElement(By.id("search-field")).sendKeys("Rice");
//	List<WebElement> filter = driver.findElements(By.xpath("//tr/td[1]"));
//	List<WebElement>filterlist = list.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
//	Assert.assertEquals(filter.size(), filterlist.size());
//	//filter.stream().forEach(s->System.out.println(s));
		
		
		//Relative Locators
//		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
//		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
//		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		
		
		
		//open link, open new tab, open new link in tab, copy 1st entry, paste
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		//parent and child window structure
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parent = it.next();
//		String child = it.next();
//		driver.switchTo().window(child);
//		driver.get("https://rahulshettyacademy.com/");
//		 Thread.sleep(5000); // Just to see the result
//
//		String link = driver.findElement(By.cssSelector("a[href*=https://courses.rahulshettyacademy.com/p/get-access-to-all-courses]")).getText();
//		 Thread.sleep(5000); // Just to see the result
//
//		driver.switchTo().window(parent);
//		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys(link);
//		 Thread.sleep(5000); // Just to see the result
//	        driver.quit();
		//driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys(link);)
		//driver.quit();
	        
//	        driver.get("https://www.google.com");
//	        ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
//	        Set<String> handles = driver.getWindowHandles();
//	        Iterator<String> it = handles.iterator();
//	        String firstTab = it.next();   // Handle of the first tab
//	        String secondTab = it.next();  // Handle of the second tab
//	        driver.switchTo().window(secondTab);
//	        driver.get("https://www.bing.com");
//	        driver.switchTo().window(firstTab);
//	        Thread.sleep(5000); // Just to see the result
//	        driver.quit();
	        
//	        driver.get("https://rahulshettyacademy.com/angularpractice/");
//	        WebElement name = driver.findElement(By.xpath("//div/input[@name='name']"));
//	        File file = name.getScreenshotAs(OutputType.FILE);
//	        FileUtils.copyFile(file, new File("logo.png"));
//	        
//	        System.out.println(name.getRect().getDimension().getHeight());
//	        System.out.println(name.getRect().getDimension().getWidth());

		
	//}

}
