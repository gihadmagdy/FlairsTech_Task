package pages;

import Utils.LoggerManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class LoginPage extends BasePage{

    public WebDriver driver;
    WebDriverWait wait;
    private static final long WAIT = 50;
    LoggerManager utils = new LoggerManager();


    @FindBy(xpath = "//h5")
    public WebElement title;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement login;

public LoginPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
    wait=new WebDriverWait(driver, Duration.ofSeconds(WAIT));
}
public void validatePageLoaded(){
    waitt(title);
    Assert.assertTrue(title.isDisplayed());
}
public void enterLoginData() throws IOException, ParseException {
    JSONParser j = new JSONParser();
    FileReader f = new FileReader("C://Users//Gihad.Magdy//IdeaProjects//Flairs_tech_Task//src//test//resources//TestData//testdata.json");
    Object o = j.parse(f);
    JSONObject detail = (JSONObject)o;
    enter_text(username,(String)detail.get("USERNAME"));
    enter_text(password,(String)detail.get("PASSWORD") );
}
public void clickLogin(){
    click(login);
}



}
