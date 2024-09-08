package stepdefinition;

import Utils.BrowserDriver;
import io.cucumber.java.en.And;
import pages.RecordPage;

import java.awt.*;

public class RecordStepDef extends BrowserDriver {
   public RecordPage recordPage=new RecordPage(driver);

   @And("user click on add button")
    public void user_click_add(){
       recordPage.clickAddBtn();

   }
   @And("user select user role")
   public void user_Select_role() throws InterruptedException, AWTException {
      recordPage.selectRole();
   }
   @And("user enter name")
   public void user_enter_name() throws InterruptedException, AWTException {
      recordPage.enterEmployeeName();
   }
   @And("user select user status")
   public void user_select_status() throws InterruptedException, AWTException {
      recordPage.selectStatus();
   }
   @And("user enter user name")
   public void user_enter_username(){
      recordPage.enterUserName();
   }
   @And("user enter password and confirm password")
   public void user_enter_password(){
      recordPage.enterPassword();
   }
   @And("user click save")
   public void user_click_save(){
      recordPage.clickSave();
   }



}
