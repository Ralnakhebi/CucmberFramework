package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class ProfilePage {


    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // xpath for logo
    @FindBy(xpath = "//*[@alt='Logo']")
    public WebElement logobutton;

    // xpath for the Collapse button
    @FindBy(xpath = "//*[@alt='Collapse']")
    public WebElement ArrowCollapseButton;


///////////////////////////////////////////////////////////////////////////////
    // [dropdown Manue start]

    // xpath for drobdown manue
    @FindBy(xpath = "//button[@tabindex='0']")
    public WebElement drobManueButton;


    // xpath for the username and role in dropdown manue
    @FindBy(xpath = "//*[@class='fw-bold'] [1]")
    public WebElement usernameAndRole;

    // xpath for the My Subscriptions button in dropdown manue
    @FindBy(xpath = "(//*[text()='My Subscriptions'])[2]")
    public WebElement MySubscriptionsbutton;




    @FindBy(xpath = "//*[text()='My Memberships']")
    public WebElement MyMembershipsbutton;


  

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;

    //[dropdown manue End]
/////////////////////////////////////////////////////////////////////////////////////
    @FindBy(id = "changePasswordButton")
    public WebElement changepassword;

    @FindBy(id = "newPassword")
    public WebElement newPassword1;

    @FindBy(id = "newPassword2")
    public WebElement newPassword2;

    @FindBy(xpath = "//button[@class='btn btn-dark text-white me-2']")
    public WebElement confirmButton;

    @FindBy(xpath = "//button[@class='btn btn-danger text-white me-2']")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible fade show mt-1']")
    public WebElement textmessagepassword;




    @FindBy(xpath = "//*[@class='text-danger']")
    public WebElement textmessageusername;

    @FindBy(xpath = "//*[@class='toast-body']")
    public WebElement successmessageusername;

    @FindBy(xpath = "//button[@class='btn btn-ghost-dark rounded-circle']")
    public WebElement editbutton;

    @FindBy(id ="username")
    public WebElement editeusername;

    @FindBy(xpath = "//*[@class='icon']")
    public WebElement rightbutton;

    @FindBy(xpath = "//button[@class='btn btn-ghost-danger rounded-circle']")
    public WebElement closebutton;


    public void Changepassword (String password1){

        ReusableMethods.waitForClickablility(newPassword1,10).clear();
        newPassword1.click();
        newPassword1.sendKeys(password1);
        newPassword2.click();
        newPassword2.clear();
        newPassword2.sendKeys(password1);
        confirmButton.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void Changeusername(String username){

        ReusableMethods.waitForClickablility(editeusername,10).clear();
        editeusername.sendKeys(username);
    }

    // xpath for collapse Arrow Button
    @FindBy(xpath = "//*[@alt='Collapse']")
    public WebElement collapse;

    ////////////////////////////////////////////////

    //Departments tap/icon
    @FindBy(xpath = "//a[@href='#/departments/department']")
    public WebElement departmentTap;

    ////////////////////////////////////////////////
    //Permissions tap/icon
    @FindBy(id = "link10")
    public WebElement PermissionsButton;


}
