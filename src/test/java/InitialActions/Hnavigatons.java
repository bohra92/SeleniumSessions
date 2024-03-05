package InitialActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hnavigatons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		driver.manage().window().maximize();
		//navigation to
		driver.navigate().to("https://google.co.in");
		System.out.println("current title : "+driver.getTitle());
		//2nd navigation
		driver.navigate().to("https://amazon.in");
		System.out.println("current title : "+driver.getTitle());
		//back and forward
		driver.navigate().back();
		System.out.println("current title after back: "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("current title after forward: "+driver.getTitle());
		
		//refresh
		driver.navigate().refresh();
		System.out.println("current title after refresh: "+driver.getTitle());
		
		driver.close();
		
	}

}
