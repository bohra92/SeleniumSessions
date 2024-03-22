package InitialActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jframes {

	public static void main(String[] args) throws InterruptedException {
		By frame1 = By.xpath("//frame[contains(@src,'frame_1')]");
		By frame2 = By.xpath("//frame[contains(@src,'frame_2')]");
		By frame3 = By.xpath("//frame[contains(@src,'frame_3')]");
		
		
		By frame1tf = By.xpath("//input[@name='mytext1']");
		By frame2tf = By.xpath("//input[@name='mytext2']");
		By frame3tf = By.xpath("//input[@name='mytext3']");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		driver.switchTo().frame(driver.findElement(frame1));
		driver.findElement(frame1tf).sendKeys("text1");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(frame2));
		driver.findElement(frame2tf).sendKeys("text2");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(frame3));
		driver.findElement(frame3tf).sendKeys("text3");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.close();
		
		//maincontext => frame 1 => X frame2
		//frame1 =>maincontext =>frame2

	}

}
