package assignment12aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitaskcreation {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
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
        od.findElement(By.id("container_tasks")).click();
        od.findElement(By.cssSelector(".addNewButton>.downIcon")).click();
        od.findElement(By.cssSelector(".createNewTasks")).click();
        //adding customer details identifying dropdown and selecting elements
     // od.findElement(By.cssSelector(".customerSelector .selectedItem")).click();
      //od.findElement(By.cssSelector(".customerSelector .itemRow:nth-of-type(3)")).click();
       //adding project details identifying dropdown and selecting elements
      // WebElement projectS=od.findElement(By.cssSelector(".projectSelector .SelectedItem"));
       //projectS.clear();
       //projectS.click();
       //od.findElement(By.cssSelector(".projectSelector .itemRow:nth-of-type(5)")).click();
       //Adding task and click on create task Button
       od.findElement(By.cssSelector("Input[placeholder='Enter task name']")).sendKeys("13testing");
       od.findElement(By.cssSelector("#createTasksPopup .components_button_label")).click();
       //selecting checkbox of above created task and deleteing it
        //checkbox identify and selection
       od.findElement(By.cssSelector(".createdTasksRowsTable .img")).click();
       //delete above task
       od.findElement(By.cssSelector(".bulkOperationsPanel .delete")).click();
       od.findElement(By.cssSelector(".deleteDialog .submitTitle")).click();
       //verifying if it is deleted or not
      od.findElement(By.cssSelector(".rightContainer .cellWrapper>input")).sendKeys("13testing");
	}

}
