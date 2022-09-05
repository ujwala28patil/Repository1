package ImportantAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FontColorsizevalidtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		WebElement radipbtn=driver.findElement(By.cssSelector("#radio-btn-example>fieldset>legend"));
		// 1.validation of font color and background color
		System.out.println("Font color: "+radipbtn.getCssValue("color"));
		System.out.println("Font size: "+radipbtn.getCssValue("font-size"));
		System.out.println("background color: "+radipbtn.getCssValue("background"));
		// 2.validation of font color and background color
		WebElement selectbtn=driver.findElement(By.cssSelector("#select-class-example>fieldset>legend"));
		System.out.println("Font color: "+selectbtn.getCssValue("color"));
		System.out.println("Font size: "+selectbtn.getCssValue("font-size"));
		System.out.println("background color: "+selectbtn.getCssValue("background"));
		// 3.validation of font color and background color
		WebElement multiselect=driver.findElement(By.cssSelector("#multi-select-example-div>fieldset>legend"));
		System.out.println("Font color: "+multiselect.getCssValue("color"));
		System.out.println("Font size: "+multiselect.getCssValue("font-size"));
		System.out.println("background color: "+multiselect.getCssValue("background"));
		// 4.validation of font color and background color
		WebElement checkbox=driver.findElement(By.cssSelector("#checkbox-example-div>fieldset>legend"));
		System.out.println("Font color: "+checkbox.getCssValue("color"));
		System.out.println("Font size: "+checkbox.getCssValue("font-size"));
		System.out.println("background color: "+checkbox.getCssValue("background"));
		//5.validation of openwindow
		WebElement openwindow=driver.findElement(By.cssSelector("#openwindow"));
       System.out.println("Font color: "+openwindow.getCssValue("color"));
		System.out.println("Font size: "+openwindow.getCssValue("font-size"));
	    System.out.println("background color: "+openwindow.getCssValue("background-color"));

	}

}
