package InitialActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Einitial {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.tagName("title")));
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		WebElement checkBike  = driver.findElement(By.xpath("//input[@value='Bike']"));
		WebElement checkCar  = driver.findElement(By.xpath("//input[@value='Car']"));
		WebElement checkBoat  = driver.findElement(By.xpath("//input[@value='Boat']"));
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='male']"));
		fname.sendKeys("Kiran");
		checkBike.click();
		checkCar.click();
		checkBoat.click();
		maleRadio.click();
		//xpath syntax
		

	}

}
