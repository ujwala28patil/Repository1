package ImportantAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {
	public static void main(String []args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://www.redbus.in");
    driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
    driver.findElement(By.cssSelector("#search_div ul>li")).click();//sugg selection
    driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
    driver.findElement(By.cssSelector("#search_div ul>li")).click();//sugg selection
    driver.findElement(By.cssSelector(".text-trans-uc")).click();
    driver.findElement(By.cssSelector(".rb-monthHeader>td:nth-of-type(3)>button")).click();//for navnext month
    driver.findElement(By.cssSelector(".rb-calendar tr:nth-of-type(4)>td:nth-of-type(4)")).click();//date selection
    driver.findElement(By.id("search_btn")).click();//search btn
    driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-of-type(4) .custom-checkbox")).click();//checkbox after6pm
    driver.findElement(By.cssSelector(".list-chkbox>li:nth-of-type(3) .custom-checkbox")).click();//for AC Chkbx
    
    List<WebElement> busnames=driver.findElements(By.cssSelector(".column-two>div"));
    for(int i=0;i<busnames.size();i++) {
    	System.out.println((busnames.get(i)).getText());
    }
    List<WebElement> buspp=driver.findElements(By.cssSelector(".seat-fare>div:nth-of-type(2)>span"));
    for(int i=0;i<buspp.size();i++) {
    	System.out.println((buspp.get(i)).getText());
    }
}
}