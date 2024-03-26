package E2EFlows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}
	
	public void loadPage(String url) {
		driver.get(url);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void fillTextFields(By locator ,String val) {
		getElement(locator).sendKeys(val);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public Select initializeSelect(By locator) {
		Select select = new Select(getElement(locator));
		return select;
	}
	
	public void selectByValue(By locator,String val) {
		Select select = initializeSelect(locator);
		select.selectByValue(val);
	}
	
	public void selectByVisibleText(By locator,String val) {
		Select select = initializeSelect(locator);
		select.selectByVisibleText(val);
	}
	
	public void selectByIndex(By locator,int val) {
		Select select = initializeSelect(locator);
		select.selectByIndex(val);
	}
	
	
}
