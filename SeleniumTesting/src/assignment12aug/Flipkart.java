package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
  List<WebElement> menu=driver.findElements(By.className("xtXmba"));
  System.out.println("Menucount="+menu.size());
  for(int i=0;i<menu.size();i++) {
	  System.out.println(menu.get(i).getText());
  }
	}

}
