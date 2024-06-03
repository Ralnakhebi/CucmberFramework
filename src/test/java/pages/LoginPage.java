package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // xpath for usernameField
    @FindBy(id = "username")
    public WebElement usernameField;

    // xpath for passwordField
    @FindBy(id = "password")
    public WebElement passwordField;


    //xpath for SigninButton
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement SigninButton;

    //xpath for error massage
    @FindBy(xpath = "//*[.='Invalid Credentials']")
    public WebElement errorMassage;


    public void editProfileLogin() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.loginButton.click();

        LoginPage lg = new LoginPage();

        ReusableMethods.waitForVisibility(lg.usernameField,10).sendKeys(ConfigReader.getProperty("username2"));
        ReusableMethods.waitForVisibility(lg.passwordField,10).sendKeys(ConfigReader.getProperty("password2"));
        lg.SigninButton.click();
    }

    public void login(String Username, String password) {
        usernameField.sendKeys(Username);
        passwordField.sendKeys(password);
        SigninButton.click();
    }
}

