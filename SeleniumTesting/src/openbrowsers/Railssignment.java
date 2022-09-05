package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String currentworkingdir=System.getProperty("user.dir");
        System.out.println(currentworkingdir);
		String chromeExePath=currentworkingdir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
   //System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
 //ChromeDriver cdriver=new ChromeDriver(); //or
 		//creating an instance of Chrome browser and up-casting it to WebDriver interface
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://erail.in/");
 		System.out.println(driver.getCurrentUrl());
 		System.out.println(driver.getTitle());
 		
 		System.out.println(driver.getPageSource().length());
 		driver.close();
	}

}
