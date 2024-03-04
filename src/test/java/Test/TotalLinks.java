package Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TotalLinks {

	public static void main(String[] args) {ß
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
		Actions act = new Actions(driver);
		act.moveToElement(null).perform()
		driver.close();

	}

}
