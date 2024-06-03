package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WelcomePage {

    public WelcomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // xpath for login button in Welcome Page
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    // xpath for the Title in the Welcome Page
    @FindBy(xpath = "//h1[.='Welcome to QuaSpareparts.com']")
    public WebElement homePageTitle;


}
