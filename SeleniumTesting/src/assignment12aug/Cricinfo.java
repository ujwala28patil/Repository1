package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
  driver.get("https://www.cricinfo.com");
  //validate home page
  System.out.println(driver.getTitle());
  System.out.println(driver.getTitle().contains("Live cricket scores, match schedules, latest cricket news"));
  		List<WebElement> menu=driver.findElements(By.cssSelector(".ds-popper-wrapper>a"));
  		System.out.println(menu.size());
  		for(int i=0;i<menu.size();i++) {
  			System.out.println(menu.get(i).getText());
  		}
	}

}
