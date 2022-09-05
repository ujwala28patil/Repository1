package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicbuttonblue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String currworkdir=System.getProperty("user.dir");
  String exepath=currworkdir+"\\Executables\\chromedriver.exe";
  System.setProperty("webdriver.chrome.driver", exepath);
  WebDriver drive=new ChromeDriver();
  drive.get("https://demo.vtiger.com/vtigercrm/index.php");
//type username as admin
  WebElement username=drive.findElement(By.id("username"));
  username.clear();
  username.sendKeys("admin");
  //type password as Test@123
  WebElement password=drive.findElement(By.name("password"));
  password.clear();
  password.sendKeys("Test@123");
  WebElement submitBtn=drive.findElement(By.className("buttonBlue"));
	//perform required operation
	submitBtn.click();
  //drive.close();
  
	}

}
