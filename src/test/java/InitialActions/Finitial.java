package InitialActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finitial {

	public static void main(String[] args) {
		int count = 0;
		String matcher = "blogger";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		// attribute value
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			
			String linkAsAText = link.getAttribute("href");
			if (linkAsAText != null) {
				
				if (linkAsAText.contains(matcher.toLowerCase())) {
					count++;
					System.out.println(linkAsAText);
				}
				System.out.println(linkAsAText);
			}
		}
		System.out.println("links with "+matcher +"  :" + count);

		driver.close();

	}

}
