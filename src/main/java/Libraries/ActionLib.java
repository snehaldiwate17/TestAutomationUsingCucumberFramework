package Libraries;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.LogUtil;

public class ActionLib {
	public static void clickOnElement(WebDriver driver, WebElement element) {
		PropertyConfigurator.configure("D:\\DemoMavenProject\\Cucumber_Selenium\\src\\main\\resources\\logs\\log4j.properties");
		element.click();
		LogUtil.log.info("Clicked on element :"+element);
	}
	
	public static void enterTextInTextBox(WebDriver driver, WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static String getText(WebDriver driver, WebElement element) {
		String text = element.getText();
		return text;
	}
}
