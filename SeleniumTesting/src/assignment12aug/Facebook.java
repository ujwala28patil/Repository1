package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https:www.facebook.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String actual=driver.getTitle();
		String Exptitle="Facebook – log in or sign up";
		System.out.println(Exptitle.length());
		System.out.println(actual.equals(Exptitle));
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		System.out.println(driver.findElement(By.id("day")).isDisplayed());
		System.out.println(driver.findElement(By.id("day")).isEnabled());
		driver.findElement(By.id("day")).click();
		//driver.findElement(By.id("day")).sendKeys("12");
		
		driver.findElement(By.id("day")).isSelected();
		System.out.println(driver.findElement(By.id("month")).isDisplayed());
		System.out.println(driver.findElement(By.id("month")).isEnabled());
		//driver.findElement(By.id("month")).sendKeys("Feb");
		System.out.println(driver.findElement(By.id("year")).isDisplayed());
		System.out.println(driver.findElement(By.id("year")).isEnabled());
		//driver.findElement(By.id("year")).sendKeys("2012");
		///multiple option count
		List<WebElement> day=driver.findElements(By.cssSelector("#day option"));
		System.out.println(day.size());
		List<WebElement> month=driver.findElements(By.cssSelector("#month option"));
		System.out.println(month.size());
		List<WebElement> year=driver.findElements(By.cssSelector("#year option"));
		System.out.println(year.size());
		//default value
		
		
	}

}
