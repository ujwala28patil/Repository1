package browseropcssselector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11aug {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
 String Titlepage=driver.getTitle();//verify loginpage
 System.out.println(Titlepage.equals("vtiger"));
 //enter username and password and click on login button
 
 WebElement username=driver.findElement(By.id("username"));
 username.clear();
 username.sendKeys("admin");
 WebElement pwd=driver.findElement(By.id("password"));
 pwd.clear();
 pwd.sendKeys("Test@123");
 driver.findElement(By.className("button")).click();
 Thread.sleep(2500);
 //verify HomePage
 String homepage=driver.getTitle();
 System.out.println(homepage.contains("dashboard"));
 driver.findElement(By.cssSelector("button.addButton" )).click();
driver.findElement(By.cssSelector("a[data-name='History']")).click();
driver.findElement(By.cssSelector("button.addButton" )).click();
driver.findElement(By.cssSelector("a[data-name='CalendarActivities']")).click();
driver.findElement(By.cssSelector("button.addButton" )).click();
driver.findElement(By.cssSelector("a[data-name='LeadsByStatus']")).click();
//find signut button icon
driver.findElement(By.cssSelector(".userName")).click();
driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
	}

}
