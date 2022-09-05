package browseropcssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demositebrowser {

	public static void main(String[] args) {

 System.setProperty("webdriver.gecko.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://demosite.executeautomation.com");
 driver.findElement(By.cssSelector("#userName")).sendKeys("execution");
 driver.findElement(By.name("Password")).sendKeys("admin");
 driver.findElement(By.name("Login")).click();
	}

}
