package ImportantAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Etrain {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		WebElement st1=driver.findElement(By.cssSelector("#tbsfi1"));
		st1.sendKeys("MUMBAI");
		driver.findElement(By.cssSelector("div.ui-autocomplete>div:nth-of-type(3)>a")).click();
		WebElement st2=driver.findElement(By.cssSelector("#tbsfi3"));
		st2.sendKeys("Pune");
		driver.findElement(By.cssSelector(".ui-autocomplete>div>a")).click();
		driver.findElement(By.cssSelector("#tbsfi4")).click();
		driver.findElement(By.cssSelector(" .dpdd .nav")).click();
		driver.findElement(By.cssSelector("Input[date='1662575400000']")).click();
		WebElement q=driver.findElement(By.cssSelector("#tbsfi5"));
		q.click();
		Select quota=new Select(q);
		quota.selectByIndex(1);
		driver.findElement(By.cssSelector("#tbssbmtbtn")).click();
		//List<WebElement> tain=driver.findElements(By.cssSelector(".trainlist>table>tbody>tr"));
		//List<WebElement> sugg=driver.findElements(By.cssSelector("table>tbody"));
		List<WebElement> tainno=driver.findElements(By.cssSelector("[class='trainlist rnd5'] tbody>tr>td:nth-of-type(1)"));
		List<WebElement> tain=driver.findElements(By.cssSelector("[class='trainlist rnd5'] tbody>tr>td:nth-of-type(2)"));
				
		System.out.println("Suggestion count:" +tain.size());
		//print suggestions in the console
		for(int i=0;i<tain.size();i++) {
			WebElement element=tain.get(i);
			System.out.println(element.getText());
							//or
			//System.out.println(sugg.get(i).getText());*/
		}
			for(int i=0;i<tainno.size();i++) {
				System.out.println(tainno.get(i).getText());
			}
		}


	}


