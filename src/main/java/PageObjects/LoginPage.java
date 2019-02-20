package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	 @FindBy(how=How.ID,using="authMobile")
	 public static WebElement txtBox_UserName;
	 
	 @FindBy(how=How.ID,using="mobileSubmitBtn")
	 public static WebElement btn_Submit;
	 
	 @FindBy(how=How.ID,using="authCredentialPassword")
	 public static WebElement txtBox_Password;
	 
	 @FindBy(how=How.ID,using="authCredentialPasswordSignInBtn")
	 public static WebElement btn_login;
	 
	 @FindBy(how=How.ID,using="authiframe")
	 public static WebElement frame;
	 
}
