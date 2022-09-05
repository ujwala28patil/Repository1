package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookagnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.gecko.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\geckodriver.exe");
   WebDriver fb=new FirefoxDriver();
   fb.get("https://www.facebook.com");
   String actualTitle=fb.getTitle();
   String expectedTitle="Facebook – log in or sign up";
   System.out.println("ActualTitle="+actualTitle);
   System.out.println("ExpectedTitle="+expectedTitle);
   System.out.println("Validatin="+actualTitle.equals(expectedTitle));
   fb.close();
	}

}
