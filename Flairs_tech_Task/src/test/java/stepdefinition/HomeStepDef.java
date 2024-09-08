package stepdefinition;

import Utils.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeStepDef extends BrowserDriver {
    public HomePage homePage=new HomePage(driver);

    @Then("user navigated to home page")
    public void user_navigated_to_Home(){
        //homePage.validateHome();
    }
    @And("user click on admin button")
    public void user_click_admin(){
        homePage.clickAdmin();
    }
    @And("user get number of record")
    public void user_get_record_number(){
        homePage.getRecordNo();
    }
    @Then("validate record list updated new record")
    public void validate_record_updated(){
        homePage.getNewRecordNo();
    }
    @And("user remove already added user")
    public void user_remove_user(){
        homePage.removeAddedUser();
    }
    @Then("validate record list updated")
    public void Validate_update() throws InterruptedException {
        homePage.validateRecordListupdated();
    }


}
