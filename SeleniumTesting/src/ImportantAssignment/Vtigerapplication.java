package ImportantAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerapplication {

	public static void main(String[] args) throws InterruptedException {
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
		//deleting one by one
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.widgeticons.dashBoardWidgetFooter > div > a.widget > i")).click();
        driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
        Thread.sleep(2000);
        //deleteing second one
        driver.findElement(By.cssSelector("div.widgeticons.dashBoardWidgetFooter > div > a.widget > i")).click();
        driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
        //deletin glast one
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.widgeticons.dashBoardWidgetFooter > div > a.widget > i")).click();
        driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
	}

}
