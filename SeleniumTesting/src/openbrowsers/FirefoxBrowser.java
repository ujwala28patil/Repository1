package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Eclipseworkspace\\SeleniumTesting\\Executables\\geckodriver.exe");
    FirefoxDriver fd=new FirefoxDriver();
    fd.get("http://www.google.com");
	}

}
