package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblze {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.demoblaze.com");
		List<WebElement> mobilename=driver.findElements(By.cssSelector("div#tbodyid h4>a"));
		List<WebElement> mobileprice=driver.findElements(By.cssSelector("div#tbodyid h5"));
		
		for(int i=0;i<mobilename.size();i++) {
			System.out.println(mobilename.get(i).getText()+": "+mobileprice.get(i).getText());
		}
	}

}
