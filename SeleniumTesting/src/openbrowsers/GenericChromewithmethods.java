package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericChromewithmethods {

	public static void main(String[] args) {
 String Userdir=System.getProperty("user.dir");
  System.out.println(Userdir);
  String Executable=Userdir+"\\Executables\\chromedriver.exe";
  System.setProperty("webdriver.chrome.driver",Executable);
  WebDriver cdriver=new ChromeDriver();
  cdriver.get("https://www.google.com");
//application title validation
	String ActualTitle=cdriver.getTitle();
	String ExpectedTitle="Google";
	System.out.println("Actaul Google page title is: "+ActualTitle);
	System.out.println("Expected Google page title is: "+ExpectedTitle);
	System.out.println("Google title validation: "+ActualTitle.equals(ExpectedTitle));
////validation of url
	String actualUrl=cdriver.getCurrentUrl();
	String expectedurl="https://www.google.com";
	System.out.println("Actaul Google page URL is: "+actualUrl);
	System.out.println("Expected Google page URL is: "+expectedurl);
	System.out.println("Google url validation: "+actualUrl.contains(expectedurl));
	//page source code
	String pageSource=cdriver.getPageSource();
	System.out.println("Page source code content length: "+pageSource.length());
	
	//close the current browser
	cdriver.close();
}
}