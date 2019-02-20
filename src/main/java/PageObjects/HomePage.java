package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(how = How.ID, using = "get_sign_in")
	public static WebElement link_SignIn;

	@FindBy(how = How.XPATH, using = "//*[@class='ico13 blue db padT10']")
	public static WebElement txt_loginUser;

}