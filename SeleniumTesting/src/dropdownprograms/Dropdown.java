package dropdownprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://demo.automationtesting.in/Register.html");
		//**** Identify dropdown list
        WebElement sk=dr.findElement(By.id("Skills"));
      //**** Create an instance of Select class and pass above element into its constructor
        Select skill=new Select(sk);
      //**** check whether dropdown is multiselect dropdown or not
        System.out.println("Is dropdown is allowing you to select multiple option: "+skill.isMultiple());
      //**** get default or already select option
	System.out.println("already Selected option or default text init="+skill.getFirstSelectedOption().getText());
	//get option count 
	List<WebElement> Options=skill.getOptions();
	for(int i=0;i<Options.size();i++) {
		System.out.println("Option "+i+": "+Options.get(i).getText());
	}
	//Selection byusing various functions
	skill.selectByIndex(1);
	System.out.println("Already selected option name: "+skill.getFirstSelectedOption().getText());
	skill.selectByValue("C");
	System.out.println("Already selected option name: "+skill.getFirstSelectedOption().getText());
	skill.selectByVisibleText("AutoCAD");
	System.out.println("Already selected option name: "+skill.getFirstSelectedOption().getText());
	//TODO: validation dropdown skills are getting displayed in ascending order
	List<String> actuall=new ArrayList<String>();
	for(int i=1;i<Options.size();i++) {
		actuall.add(skill.getOptions().get(i).getText());
	}
	List<String> duplist=new ArrayList<String>();
	duplist.addAll(actuall);
	Collections.sort(duplist);
	System.out.println(duplist.size());
	System.out.println(duplist);
	System.out.println(duplist.equals(Options));
	
	
	}
}
