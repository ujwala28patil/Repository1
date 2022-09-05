package selenumSyncwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com");
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   //verifying login page elements by using isdisplyed,isenabled,isselected and getattribute and gettext methods
  WebElement username= driver.findElement(By.id("txtUsername"));
  System.out.println(username.isDisplayed());
  System.out.println(username.isEnabled());
  System.out.println(username.isSelected());
  String attribute=username.getAttribute("className");
  System.out.println(attribute);
 
  WebElement pwd=driver.findElement(By.id("txtPassword"));
  System.out.println(pwd.isDisplayed());
  System.out.println(pwd.isEnabled());
  System.out.println(pwd.isSelected());
  
  
  WebElement login=driver.findElement(By.id("btnLogin"));
  System.out.println(login.isDisplayed());
  System.out.println(login.isEnabled());
  System.out.println(login.isSelected());
  String name=login.getAttribute("value");
  System.out.println(name);
  
  WebElement fyp=driver.findElement(By.id("forgotPasswordLink"));
  System.out.println(fyp.isDisplayed());
  System.out.println(fyp.isEnabled());
  String link=fyp.getText();
  System.out.println(link);
  
  		
  
	}
	

}
