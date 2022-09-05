package xpathAssignmnt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitimeasgn {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver od=new ChromeDriver();
		 od.get("https://demo.actitime.com/login.do");
		 od.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicit wait
		 //Verifying login page
    	 WebElement username=od.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys("admin");
		 WebElement pass=od.findElement(By.name("pwd"));
		 pass.clear();
		 pass.sendKeys("manager");
		 WebElement loginbutton=od.findElement(By.className("initial"));
		 loginbutton.click();
		 //explicit wait()
		 Thread.sleep(2000);
		 //finding elememts for creating new task
        od.findElement(By.xpath("//div[@id='container_tasks']")).click();
        od.findElement(By.xpath("//div[text()='Add New']")).click();
        od.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
       od.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("manul");
       od.findElement(By.xpath("//div[text()='Create Tasks']")).click();
       
	}

}
