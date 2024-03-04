package InitialActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cinitial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		//Thread.sleep(2000);
		//getting current url
		//System.out.println(driver.getCurrentUrl());
		
		WebElement firstName =  driver.findElement(By.id("firstName"));
		WebElement lastName =  driver.findElement(By.id("lastName"));
		By name = By.className(null)
		
		firstName.sendKeys("Kiran");
		lastName.sendKeys("Thalaiva");
		
		//getting page source
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		Thread.sleep(1000);
		driver.close();
		
//		<input required="" 
//				autocomplete="off" 
//				placeholder="First Name" 
//				type="text" 
//				id="firstName" 
//				class=" mr-sm-2 form-control">
		
		//firstname , lastname , address , email , subject 

	}

}
