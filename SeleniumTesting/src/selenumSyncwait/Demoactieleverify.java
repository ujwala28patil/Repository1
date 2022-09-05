package selenumSyncwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoactieleverify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.actitime.com/login.do");
  System.out.println(driver.getTitle());
  String ExpTitle="actiTIME";
  System.out.println(driver.getTitle().equals(ExpTitle));
    String actualurl=driver.getCurrentUrl();
    String expectedurl="https://demo.actitime.com";
    System.out.println(actualurl);
    System.out.println(expectedurl);
    System.out.println("Validation="+actualurl.contains(expectedurl));
    //Verifying login elements
    WebElement usr=driver.findElement(By.id("username"));
    System.out.println(usr.isDisplayed());
    System.out.println(usr.isEnabled());
    
    WebElement psr=driver.findElement(By.name("pwd"));
    System.out.println(psr.isDisplayed());
    System.out.println(psr.isEnabled());
    
    WebElement btn=driver.findElement(By.className("initial"));
    System.out.println(psr.isDisplayed());
    System.out.println(psr.isEnabled());
}
}