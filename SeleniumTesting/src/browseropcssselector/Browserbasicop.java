package browseropcssselector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserbasicop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().window().setSize(new Dimension(450,500) );
	
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().refresh();
	
	driver.navigate().to("https://www.google.com");
	driver.close();
	}

}
