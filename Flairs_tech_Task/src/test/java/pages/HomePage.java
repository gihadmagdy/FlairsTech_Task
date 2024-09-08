package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomePage extends BasePage {
    public WebDriver driver;
    int record;
    int newRecord;
    @FindBy(xpath = "(//*[@class='oxd-main-menu-item'])[1]")
    public WebElement admin;
    @FindBy(xpath = "//*[@class='oxd-text oxd-text--span']")
    public WebElement recordsNo;
    @FindBy(xpath = "//h5")
    public WebElement title;
    @FindBy(xpath = "(//*[@class='oxd-icon-button oxd-table-cell-action-space'][@type='button'])[3]")
    public WebElement deleteIcon;
    @FindBy(xpath = "(//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin'][@type='button'])")
    public WebElement confirmDelete;


    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void validateHome(){
        waitt(title);
        Assert.assertTrue(title.isDisplayed());
    }

    public void clickAdmin(){
        click(admin);
    }
    public void getRecordNo(){
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(get_txt(recordsNo));
        while (m.find()) {
            record = Integer.parseInt(m.group());
        }
    }
    public void getNewRecordNo(){
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(get_txt(recordsNo));
        while (m.find()) {
            newRecord = Integer.parseInt(m.group());
        }
        Assert.assertTrue(newRecord==record+1);
    }
    public void removeAddedUser(){
        click(deleteIcon);
        click(confirmDelete);
    }
    public void validateRecordListupdated() throws InterruptedException {
        Thread.sleep(3000);
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(get_txt(recordsNo));
        while (m.find()) {
            newRecord = Integer.parseInt(m.group());
        }
        Assert.assertTrue(newRecord==record);
    }


}
