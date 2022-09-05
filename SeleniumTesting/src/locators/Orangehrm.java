package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
	 WebDriver od=new ChromeDriver();
	 od.get("https://opensource-demo.orangehrmlive.com");
	 //Verifying login page
	 System.out.println(od.getTitle());
	 String expectedTitle="OrangeHRM";
	 System.out.println(expectedTitle);
	 System.out.println(od.getTitle().equals(expectedTitle));
	 System.out.println(od.getCurrentUrl());
	String ExpectedUrl="https://opensource-demo.orangehrmlive.com";
	System.out.println(od.getCurrentUrl().contains(ExpectedUrl));
	System.out.println(od.getPageSource().length());
	//Verifying username and password
	WebElement username=od.findElement(By.cssSelector("div.orangehrm-login-form  div:nth-child(2)  div:nth-child(2) > input"));
	username.clear();
	username.sendKeys("Admin");
	/*WebElement password=od.findElement(By.cssSelector("input[name='password']"));
	password.clear();
	password.sendKeys("admin123");
	WebElement Login=od.findElement(By.cssSelector(".oxd-button"));
	Login.click();
	String homepage=od.getCurrentUrl();
	System.out.println(homepage.contains("dashboard"));
	od.findElement(By.tagName("a")).click();
	*/od.close();
	}

}
