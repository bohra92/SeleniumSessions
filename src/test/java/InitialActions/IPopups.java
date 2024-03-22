package InitialActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IPopups {

	public static void main(String[] args) {
		IPopups popups = new IPopups();
		// popups
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigation to
		driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		// popups.alertTest(driver);
		// popups.confirmTest(driver);
		// popups.promptTest(driver);

		// driver.close();

	}

	public void alertTest(WebDriver driver) {
		// alert
		By alertButton = By.id("alertexamples");
		By alertMsg = By.id("alertexplanation");

		driver.findElement(alertButton).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		System.out.println(driver.findElement(alertMsg).getText());
	}

	public void confirmTest(WebDriver driver) {
		// confirm
		By confirmButton = By.id("confirmexample");
		By confirmMsg = By.id("confirmreturn");

		driver.findElement(confirmButton).click();
		Alert alert = driver.switchTo().alert();
		// Thread.sleep(2000);
		alert.accept();
		System.out.println(driver.findElement(confirmMsg).getText());

		driver.findElement(confirmButton).click();
		alert.dismiss();
		System.out.println(driver.findElement(confirmMsg).getText());

	}

	public void promptTest(WebDriver driver) {
		// confirm
		By promptButton = By.id("promptexample");
		By promptMsg = By.id("promptreturn");

		driver.findElement(promptButton).click();
		Alert alert = driver.switchTo().alert();
		// Thread.sleep(2000);
		alert.sendKeys("Text1");
		alert.accept();
		System.out.println(driver.findElement(promptMsg).getText());

		driver.findElement(promptButton).click();
		alert.sendKeys("Text1");
		alert.dismiss();
		System.out.println("msg => " + driver.findElement(promptMsg).getText());

	}

	public void authPopups(WebDriver driver) {
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}
}
