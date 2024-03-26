package InitialActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KWindowsHandling {

	public static void main(String[] args) {
		// windows Handling
		By windowsBtn = By.id("windowButton");
		By tabBtn = By.id("tabButton");
		By secWindowContent =  By.id("sampleHeading");
		String parentWindow,childWindow;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		parentWindow = driver.getWindowHandle();
		driver.findElement(tabBtn).click();
		Set<String> windowsList = driver.getWindowHandles();
		Iterator<String> windowsIterator = windowsList.iterator();
		parentWindow = windowsIterator.next();
		childWindow = windowsIterator.next();
		System.out.println(parentWindow + "  "+ childWindow);
		
		//switching between windows
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(secWindowContent).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
