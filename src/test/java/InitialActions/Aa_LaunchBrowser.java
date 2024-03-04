package InitialActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Aa_LaunchBrowser {
	
	public static void main(String[] args) {
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equals("chrome")) {driver = new ChromeDriver();}
		else if (browser.equals("firefox")) {driver = new FirefoxDriver();}
		else if (browser.equals("safari")) {driver = new SafariDriver();}
		else System.out.println("please enter correct browser name !!!");
		//Launch chrome
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		// navigate to url
		driver.get("https://google.com/");
		//getting title
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google")) System.out.println("PASS!! :)");
		else System.out.println("FAIL!!! :(");
		
		driver.close();
	}
	
	
	

}
