package selenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Locatorpractice {
//	public static void main(String[] args) throws InterruptedException, IOException {
//		System.getProperty("Webdriver.chrome.driver",
//				"C://Users//Vinita//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
	
	
	@Test
	public void test2() {
		System.out.println("Hi");
	}
	
	@Test
	public void test3() {
		System.out.println("Amey");
	}
	
	
	
	
	
	
	
	
	
	
	
	
		// driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		// WebElement staticdropdown =
		// driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		//using dropdown and select methods
//		Select dropdown = new Select(staticdropdown);
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("AED");
//		
//		//Normal method
//		driver.findElement(By.xpath("//div//select//option[@value='USD']")).click();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//div//select//option[@value='INR']")).click();

//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("(//a[contains(@value,'BLR')])[1]")).click(); 
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
//		

//	driver.findElement(By.id("autosuggest")).sendKeys("Indi");
//	Thread.sleep(1000);
//	List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
//	
//	for(WebElement option:options)
//	{
//		if(option.getText().equalsIgnoreCase("India"))
//		{
//			option.click();
//			break;
//		}
//	}
//		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
//		Assert.assertFalse(true);
//		Assert.assertEquals(By.xpath("(//a[contains(@value,'BLR')])[1]"), "5 adults");
//		
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected();
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
//		
//		//count of checkboxes
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//		
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//		
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Vinita");
//		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("vinita@gmail.com");
//		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("vinita");
//		driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
//		//driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
//		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("Female");
//		driver.findElement(By.xpath("//input[@value='option1']")).click();
//		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("16-02-1997");
//		driver.findElement(By.xpath("//input[@value='Submit']")).click();

//		driver.get("https://www.spicejet.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='International']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[contains(text(),'BKK')]")).click();
//		
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
//		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'GOI')]")).click();
//		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
//		
//		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
//		int i=1,j=1;
//		while(i<4) {
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//			i++;
//		}
//		while(j<3) {
//			driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
//			j++;
//		}
//		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
//		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Family & Friends']")).click();
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']/*[local-name()='svg']/*[local-name()='circle'])[1]")).isSelected());
//		driver.findElement(By.xpath("//*[@data-testid='home-page-flight-cta']")).click();

//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		Thread.sleep(3000);
//		int j = 0;
//		String[] itemNames = { "Beetroot", "Brinjal", "Carrot" };
//		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
//		System.out.println(products.size());
//		for (int i = 0; i < products.size(); i++) {
//
//			String name[] = products.get(i).getText().split("-");
//			String s1 = name[0].trim();
//
//			List itemNamesList = Arrays.asList(itemNames);
//
//			if (itemNamesList.contains(s1)) {
//				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();
//				j++;
//			}
//			if (j > itemNames.length)
//				break;
//		}

//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("password")).sendKeys("learning");
//		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
//		//implicit wait
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));	
//		driver.findElement(By.id("okayBtn")).click();
//		WebElement dropdown = driver.findElement(By.xpath("//div/select[@class=\"form-control\"]"));
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("Consultant");
//		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
//		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(5));
//		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"submit\"]")));
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//
//		for (int i = 0; i < 4; i++) {
//			WebDriverWait w2 = new WebDriverWait(driver,Duration.ofSeconds(5));
//			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"btn btn-info\"])[i]")));
//			driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[i]")).click();
//		}

		// driver.get("https://the-internet.herokuapp.com/windows");
//		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		String parentid = it.next();
//		String childid = it.next();
//		driver.switchTo().window(childid);
//		System.out.println(driver.findElement(By.xpath("//h3")).getText());
//		driver.switchTo().window(parentid);
//		System.out.println(driver.findElement(By.xpath("//h3")).getText());
//		

//		driver.get("https://the-internet.herokuapp.com/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[@href=\"/nested_frames\"]")).click();
//		driver.switchTo().frame(0);
//		driver.switchTo().frame(1);
//		System.out.println(driver.findElement(By.id("content")).getText());

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println(driver.findElements(By.tagName("a")).size());
//		WebElement footer = driver.findElement(By.id("gf-BIG"));
//		System.out.println(footer.findElements(By.tagName("a")).size());
//		WebElement col = footer.findElement(By.xpath("//div[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
//		System.out.print(col.findElements(By.tagName("a")).size());
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		for(int i=1;i< col.findElements(By.tagName("a")).size();i++)
//		{
//			String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
//			col.findElements(By.tagName("a")).get(i).sendKeys(newtab);
//		}
//			Set<String> window = driver.getWindowHandles();
//			Iterator<String> it = window.iterator();
//			
//			while(it.hasNext())
//			{
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				driver.switchTo().window(it.next());
//				System.out.println(driver.getTitle());
//			}

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebElement option = driver.findElement(By.xpath("//input[@type=\"checkbox\"][@id=\"checkBoxOption2\"]"));
//		String valueSelected = option.getAttribute("value");
//		System.out.println(valueSelected);
//		driver.findElement(By.id("checkBoxOption2")).click();
//		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//		Select select = new Select(dropdown);
//		select.selectByValue(valueSelected);
//		driver.findElement(By.id("name")).sendKeys(valueSelected);
//		driver.findElement(By.id("alertbtn")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		String[] s1 = driver.switchTo().alert().getText().split(",");
//		String[] s2 = s1[0].split(" ");
//		System.out.println(s2[1]);
//		Thread.sleep(2000);
//		if(s2[1].equals(valueSelected))
//		{
//			driver.switchTo().alert().dismiss();
//		}
//		String text = driver.switchTo().alert().getText();
//		if (text.contains(valueSelected))
//
//			System.out.println("Alert message success");
//
//		else
//
//			System.out.println("Something wrong with execution");

//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	int col = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
//	System.out.println("Number of columns: "+ col);
//	int row = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
//	System.out.println("Number of columns: "+ row);
//	
//	for(int i=0;i<col;i++)
//	{
//		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td")).get(i).getText());
//	}

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
//		int size = driver.findElements(By.xpath("//input[@id='autocomplete']")).size();
//		List<WebElement> s1 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
//		for(int i=0;i<s1.size();i++) {
//		
//		System.out.print(s1.get(i).getText());
//		if(s1.get(i).getText().equals("United Kingdom (UK)"))
//		{
//			System.out.print("found");
//			driver.findElement(By.xpath("//ul[@id='ui-id-1']/li")).sendKeys(Keys.DOWN);
//		}
//		}

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("autocomplete")).sendKeys("uni");
//		Thread.sleep(3000);
//		List<WebElement> items = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
//		System.out.println(items.size());
//		for (int i = 0; i < items.size(); i++) {
//			System.out.print(items.get(i).getText());
//			if (items.get(i).getText().equals("United Kingdom (UK)")) {
//				System.out.print("found");
//				driver.findElement(By.xpath("//li/div[text() = 'United Kingdom (UK)']")).click();
//			}
//		}

//		ChromeOptions options = new ChromeOptions();
//		options.setAcceptInsecureCerts(true);
//		WebDriver driver1 = new ChromeDriver(options);
//		driver1.get("https://expired.badssl.com/");
//		System.out.println(driver1.getTitle());

//	

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		List<WebElement> links = driver.findElements(By.xpath("//table[@class='gf-t']//td//li/a"));
//		SoftAssert a = new SoftAssert();
//		for (WebElement link : links) {
//			String url = link.getAttribute("href");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
//			int respcode = conn.getResponseCode();
//			System.out.println(respcode);
//
//			a.assertTrue(respcode < 400, "The link with Text" + link.getText() + " is broken with code" + respcode);
//
//		}
//		a.assertAll();
		
//	}
	
	//create array list and add names, count the no. of names starting with 'a'
//	@Test
//	public void regular() {
//			ArrayList<String> array = new ArrayList<String>();
//			array.add("Abhijit");
//			array.add("Bina");
//			array.add("Ram");
//			array.add("Adam");
//			int count,i;
//			for(i=0;i<array.size();i++)
//			{
//				String actual = array.get(i);
//				if(actual.startsWith("A"))
//				{
//					System.out.println(actual);
//				}
//			}
//			
//		}
//	@Test
//	public void usingStreams() {
//		ArrayList<String> array = new ArrayList<String>();
//	array.add("Abhijit");
//	array.add("Bina");
//		array.add("Ram");
//		array.add("Adam");
//		
//		
//		 array.stream().filter(s -> s.startsWith("A")).limit(1).
//		 forEach(s -> System.out.println(s));
//		
//	}
//	
//	@Test
//	//print names with lenght>4 uppercase
//	public void streamlenght() {
//		ArrayList<String> array = new ArrayList<String>();
//		array.add("Adhijit");
//		array.add("Bina1");
//		array.add("Ram");
//		array.add("Adam");
//		
//		List<String> name = Arrays.asList("Don","Man","women");
//		//array.stream().filter(s -> s.length()>4).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//		
//		//1st letter as A upper and sorted
//		//array.stream().filter(s -> s.startsWith("A")).map(s-> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
//		Stream<String> name1 = Stream.concat(array.stream(), name.stream());
//		name1.forEach(s -> System.out.println(s));
//	}
	
	//display unique numbers (1,2,3,3,4,5,2,3)
	//sort numbers	@Test
//	public void number() {
//		List<Integer> number = Arrays.asList(1,2,4,5,3,2,3);
//		List<Integer> uniquenum = new ArrayList<Integer>();
//		for(int i=1;i<number.size();i++)
//		{
//			if(!uniquenum.contains(number.get(i)))
//			{
//				uniquenum.add(i);
//			}
//		}
//		Collections.sort(uniquenum);
//		System.out.println(uniquenum);


//}	

//	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
		

	//}	

}
