package assignment12aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemultiele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("selenium interview questions");

Thread.sleep(2000);
//get all the suggestions
  List<WebElement>sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));	
  System.out.println("Suggestion count:" +sugg.size());
//print suggestions in the console
  for(int i=0;i<sugg.size();i++) {
	  System.out.println(sugg.get(i).getText());
  }
}

}
