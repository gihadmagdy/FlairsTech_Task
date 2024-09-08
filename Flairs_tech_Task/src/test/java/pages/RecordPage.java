package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RecordPage extends BasePage {

    public WebDriver driver;

    @FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addBtn;
    @FindBy(xpath = "(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    public WebElement userRole;
    @FindBy(xpath = "//*[@placeholder='Type for hints...']")
    public WebElement employeeName;
    @FindBy(xpath = "(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    public WebElement status;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usermmame;
    @FindBy(xpath = "(//*[@type='password'])[1]")
    public WebElement password;
    @FindBy(xpath = "(//*[@type='password'])[2]")
    public WebElement confirmPassword;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement save;


    public RecordPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickAddBtn(){
        click(addBtn);
    }
    public void selectRole() throws AWTException, InterruptedException {
        click(userRole);
        Robot robot = new Robot();  // Robot class throws AWT Exception
        Thread.sleep(2000); // Thread.sleep throws InterruptedException
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void enterEmployeeName() throws InterruptedException, AWTException {
        enter_text(employeeName,"a");
        Thread.sleep(3000);
        Robot robot = new Robot();  // Robot class throws AWT Exception
        Thread.sleep(3000); // Thread.sleep throws InterruptedException
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void selectStatus() throws InterruptedException, AWTException {
        click(status);
        Robot robot = new Robot();  // Robot class throws AWT Exception
        Thread.sleep(3000); // Thread.sleep throws InterruptedException
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void enterUserName(){
        enter_text(usermmame,"Admin6");
    }
    public void enterPassword(){
        enter_text(password,"admin123");
        enter_text(confirmPassword,"admin123");
    }
    public void clickSave(){
        click(save);
    }



}
