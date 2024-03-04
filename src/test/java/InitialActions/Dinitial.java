package InitialActions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dinitial {

	public static void main(String[] args) {
		//getbyid
		//getbyclass
		//getlinktext
		//getbypartiallinktext
		//tagName
		//getByXpath
		//getByCss
		//getText

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://tutorialsninja.com/demo/");
	
		//WebElement searchProduct =  driver.findElement(By.className("form-control"));
//		List<WebElement> navLists =  driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
//		System.out.println(navLists.size());
//		for(WebElement list : navLists) {
//			System.out.println(list.getText());
//		}
//		WebElement list;
		
//		Iterator it = navLists.iterator();
//		while(it.hasNext()) {
//			list = (WebElement) it.next();
//			System.out.println(list.getText());
//		}
		
		
		
		//container.click();
		//searchProduct.sendKeys("Laptop");
		
		//Google tests
		
		
		
		
		
		driver.get("https://google.co.in");
		List<WebElement> googleLangs =  driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(googleLangs.size());
		for(WebElement lang : googleLangs) {
			System.out.println(lang.getText());
		}
		driver.close();
	}

}
