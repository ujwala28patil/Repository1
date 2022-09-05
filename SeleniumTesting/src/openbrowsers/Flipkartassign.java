package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartassign {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
    WebDriver Fd=new ChromeDriver();
    Fd.get("https://www.flipkart.com");
  //validate page tile
    String pageTitle=Fd.getTitle();
    String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    System.out.println("Title validation: "+pageTitle.equals(expectedTitle));
	//validate current url
	String pageURL=Fd.getCurrentUrl();
	String expectedURL="https://www.flipkart.com/";
	System.out.println("Page URL validation: "+pageURL.equals(expectedURL));
	//get page source content length count
	int contentLength=Fd.getPageSource().length();
	System.out.println("Content length: "+contentLength);		
	//close the current browser instance
	Fd.close();
	}

}
