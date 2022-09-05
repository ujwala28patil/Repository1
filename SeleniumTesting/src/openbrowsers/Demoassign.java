package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://demo.actitime.com");
		System.out.println(drive.getTitle());
		String ExpectedTitle="actiTIME - Login";
		System.out.println(drive.getTitle().equals(ExpectedTitle));
		drive.getTitle().length();
   System.out.println(drive.getTitle());
   System.out.println(drive.getTitle().length());
      String actualurl=drive.getCurrentUrl();
      String expectedurl="https://demo.actitime.com";
      System.out.println(actualurl);
      System.out.println(expectedurl);
      System.out.println("Validation="+actualurl.contains(expectedurl));
      drive.getPageSource();
      drive.getPageSource().length();
      System.out.println(drive.getPageSource().length());
      drive.close();
	}

}
