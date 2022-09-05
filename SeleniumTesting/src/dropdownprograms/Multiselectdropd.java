package dropdownprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//maximize browser
		dr.manage().window().maximize();
		//implicit wait
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://omayo.blogspot.com/");
		//**** Idetify dropdown list
		WebElement cardp=dr.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select carSelect=new Select(cardp);
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+carSelect.isMultiple());
		//**** get default or already select option
		//WebElement Selectedoption=carSelect.getFirstSelectedOption();
		//String selectop=Selectedoption.getText();//or
		//System.out.println("already selected option:"+carSelect.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//get option count 
		List<WebElement> Options=carSelect.getOptions();
		for(int i=0;i<Options.size();i++) {
			System.out.println("options:"+Options.get(i).getText());
		}
		//select options from dropdown
		carSelect.selectByIndex(0);
		carSelect.selectByIndex(3);
		carSelect.selectByValue("swiftx");
		carSelect.selectByVisibleText("Hyundai");
		////get all the selected options
		List<WebElement> selectCars=carSelect.getAllSelectedOptions();
		//System.out.println("AllSelectedcars="+selectCars);
		System.out.println("AllSelectedcarscount="+selectCars.size());
		
		////unselect already select options
		carSelect.deselectByIndex(0);
		carSelect.deselectByValue("swiftx");
		carSelect.deselectAll();
	}

}
