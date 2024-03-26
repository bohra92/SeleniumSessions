package InitialActions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Bb_Initial {

	public static void main(String[] args) {
		//using sel ver < 4.6.0
		//System.setProperty("webdriver.chrome.drive","C://paths/chrome/chromedriver.exe")
		WebDriver driver = new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//delete cookies
		//driver.manage().deleteAllCookies();
	}

}
