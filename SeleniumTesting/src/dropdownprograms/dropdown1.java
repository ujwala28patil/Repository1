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

public class dropdown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://demo.automationtesting.in/Register.html");
		//**** Identify dropdown list
        WebElement sk=dr.findElement(By.id("yearbox"));
      //**** Create an instance of Select class and pass above element into its constructor
        Select skill=new Select(sk);
		//TODO: perform validation on following
				//1. Year(ascending order validation)
				//2. Month(month Sequence validation)
				//3. Days(ascending order validation)
        List<WebElement> allop=skill.getOptions();
        //for year
        List ayear=new ArrayList();
        for(int i=1;i<allop.size();i++) {
        	ayear.add(allop.get(i).getText());
        }
        System.out.println(ayear);
        List dyear=new ArrayList();
        dyear=ayear;
        Collections.sort(ayear);
        System.out.println(ayear.equals(dyear));
        //for month
       WebElement mo=dr.findElement(By.cssSelector("select[Placeholder='Month']"));
       Select month=new Select(mo);
       List<WebElement> m=month.getOptions();
       List<String> expm=new ArrayList<String>();
       for(int i=0;i<m.size();i++) {
   		expm.add(month.getOptions().get(i).getText());
   	}
      	List<String> months=new ArrayList<String>();
       months.addAll(expm);
       System.out.println(months.equals(expm));
       //for DAYS
       WebElement d=dr.findElement(By.cssSelector("#daybox"));
       Select day=new Select(d); 
       List<WebElement> day1=day.getOptions();
       List days=new ArrayList();
       for(int i=1;i<day1.size();i++) {
    	   days.add(day1.get(i).getText());
    	   
       }
       System.out.println(days);
       List expdays=new ArrayList();
       expdays.addAll(days);
       Collections.sort(days);
       System.out.println(expdays);
       System.out.println(days.equals(expdays));
	}

}
