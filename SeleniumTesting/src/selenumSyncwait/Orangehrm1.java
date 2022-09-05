package selenumSyncwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   System.out.println(driver.getTitle());
			 String expectedTitle="OrangeHRM";
			 System.out.println(expectedTitle);
			 System.out.println(driver.getTitle().equals(expectedTitle));
			 System.out.println(driver.getCurrentUrl());
			String ExpectedUrl="https://opensource-demo.orangehrmlive.com";
			System.out.println(driver.getCurrentUrl().contains(ExpectedUrl));
			System.out.println(driver.getPageSource().length());
			//Verifying username and password insingle line
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		   driver.findElement(By.className("button")).click();
		   Thread.sleep(2500);
		   System.out.println(driver.getCurrentUrl().contains("dashboard"));
		   
		   driver.findElement(By.tagName("a")).click();
		   driver.close();
	}

}
