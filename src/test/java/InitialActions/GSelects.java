package InitialActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GSelects {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		// selects
		WebElement carDrpDwn = driver.findElement(By.xpath("//select[@id='Carlist']"));
		Select cars = new Select(carDrpDwn);
		// selectByValue
		cars.selectByValue("Audi Car");
		Thread.sleep(1000);

		// SelectByIndex
		cars.selectByIndex(2);

		// byvisibletext
		cars.selectByVisibleText("Maruti Car");

		// getoptions
		List<WebElement> carsOpts = cars.getOptions();
		for (WebElement option : carsOpts) {
			System.out.print(option.getAttribute("id")+" : ");
			System.out.print(option.getText());
			System.out.println("");
		}

		
		Thread.sleep(1000);
		driver.close();

	}

}
