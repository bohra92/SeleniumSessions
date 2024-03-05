package xpathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class One {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigation to
		driver.navigate().to("https://amazon.in");
		String bestSellerLocator = "//div[@id='nav-main' and @class='nav-sprite']//a[text()='Best Sellers']";
		String titleLoctor = "//title";
		
		driver.findElement(By.xpath(bestSellerLocator)).click();
		System.out.println(driver.getTitle());
		String titleText = driver.findElement(By.xpath(titleLoctor)).getText();
		System.out.println(titleText);
		if(driver.getTitle().contains("Bestsellers")) System.out.println("TEST PASSED!!!");
		else System.out.println("TEST FAILED!!!");
		driver.close();
		//   
		//	//title[contains(text(),'Bestsellers')]
		

	}

}
