package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Libraries.ActionLib;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Util.Constant;
import Util.ExcelUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewStepDef {
	WebDriver driver = null;
	

	@Given("^I am on GoIbibo login page$")
	public void I_am_on_GoIbibo_login_page() throws Exception {
		//ExcelUtil.setExcelFile(Constant.Path_TestData, Constant.File_TestData);
		ExcelUtil.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"LoginFeature");
		System.setProperty("webdriver.chrome.driver", Constant.Chrome_DriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		ActionLib.clickOnElement(driver, HomePage.link_SignIn);
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void I_enter_username_as(String arg1) throws Exception{
		//arg1 = ExcelUtil.getCellData(0, 0);
		System.out.println(arg1);
		driver.switchTo().frame(LoginPage.frame);
		ActionLib.enterTextInTextBox(driver, LoginPage.txtBox_UserName, arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void I_enter_password_as(String arg1) throws Exception {
		//arg1 = ExcelUtil.getCellData(1, 1);
		LoginPage.btn_Submit.click();
		ActionLib.enterTextInTextBox(driver, LoginPage.txtBox_Password, arg1);
	}

	@Then("^User should should login successfully$")
	public void User_should_should_login_successfully() {
		ActionLib.clickOnElement(driver, LoginPage.btn_login);
		String loginUser = ActionLib.getText(driver, HomePage.txt_loginUser);
		System.out.println("Login user is : " + loginUser);
		driver.close();
	}

}
