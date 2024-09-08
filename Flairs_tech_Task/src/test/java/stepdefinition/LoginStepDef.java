package stepdefinition;

import Utils.BrowserDriver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_scouse.An;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import java.io.IOException;

public class LoginStepDef extends BrowserDriver {

    public LoginPage loginPage;

    @Given("user navigate to login page")
    public void user_navigate_login_page() throws IOException {
        openurl();
        loginPage=new LoginPage(driver);
        loginPage.validatePageLoaded();
    }
    @And("user enter valid credentials")
    public void user_enter_valid_cred() throws IOException, ParseException {
        loginPage.enterLoginData();
    }
    @And("user click on login button")
    public void user_click_login(){
        loginPage.clickLogin();
    }

}
