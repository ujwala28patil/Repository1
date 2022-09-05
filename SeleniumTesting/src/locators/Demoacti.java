package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoacti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		 WebDriver od=new ChromeDriver();
		 od.get("https://demo.actitime.com/login.do");
		 od.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicit wait
		 //Verifying login page
    	 WebElement username=od.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys("admin");
		 WebElement pass=od.findElement(By.name("pwd"));
		 pass.clear();
		 pass.sendKeys("manager");
		 WebElement loginbutton=od.findElement(By.className("initial"));
		 loginbutton.click();
		 //explicit wait()
		 Thread.sleep(2000);
		 od.findElement(By.className("logout")).click();
		

	}

}
