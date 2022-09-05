package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArenapagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
//checking pagination exist or not
		driver.findElement(By.cssSelector(".sidebar>div>ul>li>a")).click();
		List<WebElement>pagination=driver.findElements(By.cssSelector(".nav-pages>a"));//1st locator
		if(pagination.size()>0) {
			System.out.println("pagination exists");
		}else {
			System.out.println("pagination not exists");
		}
		//printing all paginationlinks
		List<WebElement> links=driver.findElements(By.cssSelector(".review-nav>div>a"));//2nd locator by other locator both are useful
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			
		}
		
	}

}
