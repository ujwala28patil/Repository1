package assignment12aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReakmeGSMarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.gsmarena.com");
		driver.findElement(By.cssSelector("a[href='realme-phones-118.php']")).click();
		//current page url
		//System.out.println(driver.getCurrentUrl());//page url
	
		driver.findElement(By.cssSelector("div.nav-pages>strong"));
		System.out.println(driver.getCurrentUrl());//1sr page url
		driver.findElement(By.cssSelector("div.nav-pages>a:nth-child(3)")).click();
		System.out.println(driver.getCurrentUrl());//2sr page url
		driver.findElement(By.cssSelector("div.nav-pages>a:nth-child(4)")).click();
		System.out.println(driver.getCurrentUrl());//3rd page url
		
	}

}
