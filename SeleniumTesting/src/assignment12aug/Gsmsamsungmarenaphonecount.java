package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmsamsungmarenaphonecount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.gsmarena.com");
		//validate Homepage
				System.out.println(driver.getTitle());
				System.out.println(driver.getTitle().contains("GSMArena"));

		driver.findElement(By.cssSelector(".sidebar>div>ul>li>a")).click();
		List<WebElement> phonenames=driver.findElements(By.cssSelector(".makers strong>span"));
		System.out.println("Sumsang phone count:"+phonenames.size());
		for(int i=0;i<phonenames.size();i++) {
			System.out.println(phonenames.get(i).getText());
		}

	}

}
