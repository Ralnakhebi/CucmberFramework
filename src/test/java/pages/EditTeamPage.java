package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class EditTeamPage {
    public WebDriverWait wait;
    public EditTeamPage(){
        PageFactory.initElements(Driver.getDriver() ,this);
        this.wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    }


//    @FindBy(xpath = "//button[normalize-space()='Edit Team']")
//    public WebElement EditTeamButton;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement EditTeamName;

  @FindBy(xpath = "//input[@id='react-select-2-input']")

  public WebElement EditDepartmentType;

    @FindBy(xpath = "//span[@class='text-danger']")
    public WebElement FiledMessage;

    @FindBy(xpath = "//button[normalize-space()='Delete Department']")
    public WebElement DeleteDepartment;
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    public WebElement ConfirmDelete;













}
