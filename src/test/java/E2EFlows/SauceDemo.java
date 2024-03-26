package E2EFlows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SauceDemo {

	public static void main(String[] args) {

		BrowserUtil browUtil = new BrowserUtil();

		By username = By.id("user-name");
		By password = By.id("password");
		By submit = By.id("login-button");
		By filterSelect = By.className("product_sort_container");
		By cardPrice = By.className("inventory_item_price");

		boolean isAscending = true;
		float prevPrice = 0;
		float currPrice;
		String rate;

		WebDriver driver = browUtil.getBrowserInstance("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.loadPage("https://www.saucedemo.com/");
		eleUtil.fillTextFields(username, "standard_user");
		eleUtil.fillTextFields(password, "secret_sauce");
		eleUtil.doClick(submit);
		eleUtil.selectByValue(filterSelect, "lohi");

		List<WebElement> cardsPrice = eleUtil.getElements(cardPrice);
		for (WebElement price : cardsPrice) {
			rate = price.getText();
			currPrice = Float.parseFloat(rate.replace('$', ' ').trim());
			if (currPrice < prevPrice) {
				isAscending = false;
				break;
			}
			prevPrice = currPrice;
			System.out.println(currPrice);

		}

		if(isAscending) System.out.println("TEST CASE PASSED!!!");
		else System.out.println("FAILED!!!! :(");
		browUtil.closeBrowser();
	}

}
