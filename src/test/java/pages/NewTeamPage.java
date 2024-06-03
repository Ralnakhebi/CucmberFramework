package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class NewTeamPage {
    public WebDriverWait wait;

    public NewTeamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        this.wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    }


    @FindBy(xpath = "//li[contains(@id,'link7')]")
    public WebElement TeamBtu;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement TeamName;

    @FindBy(xpath = "//input[@placeholder='Department Short Name']")
    public WebElement ShortName;

    @FindBy(xpath = "(//*[contains(@id,'react-select-2-input')])[1]")
    public WebElement DepartmentType;

    @FindBy(xpath = "(//div[@class=' css-hlgwow'])[1]")
    public WebElement DepartmentTypeDropDown;
    //*[contains(@id,'react-select-2-option-2')])"
    @FindBy(xpath = "(//*[contains(@id,'react-select-2-option-2')])")
    public WebElement TeamOption;

    @FindBy(xpath = "//input[@placeholder='Department Description']")
    public WebElement Description;

    @FindBy(xpath = "(//div[contains(@class,'css-19bb58m')])[2]")
    public WebElement TeamRoles;

    @FindBy(xpath = "//div[contains(@id,'react-select-3-option-0')]")
    public WebElement RolesBusinessOwner;

    @FindBy(xpath = "(//*[name()='svg'][@class='css-8mmkcg'])[17]")
    public WebElement Enter;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement SaveBut;
    @FindBy(xpath = "(//div[@class='toaster toast-container p-3 position-fixed top-0 end-0'])[1]")
    public WebElement SuccessMessage;


    public void click_Team_But() {
        TeamBtu.click();
    }

    public void clickDropdownDepartment() {
        wait.until(ExpectedConditions.elementToBeClickable(DepartmentType)).click();
    }

    public void Option() {
        wait.until(ExpectedConditions.elementToBeClickable(TeamOption)).click();

    }

    public void choseTeamRoles() {
        wait.until(ExpectedConditions.elementToBeClickable(TeamRoles)).click();

    }

    public void productOwner() {
        wait.until(ExpectedConditions.elementToBeClickable(RolesBusinessOwner)).click();
        TeamRoles.click();

    }

    public void EnterBut() {
        wait.until(ExpectedConditions.elementToBeClickable(Enter)).click();

    }
}
