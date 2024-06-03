package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewDepartmentPage {
    public NewDepartmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement DepartmentNameField;

    @FindBy(id = "react-select-2-input")
    public WebElement DepartmentType;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Please enter a name for department']")
    public WebElement errorMsgName;

    @FindBy(xpath = "//span[.='Please select a type for department']")
    public WebElement errorMsgType;

    @FindBy(xpath = "//p[.='New department successfully created']")
    public WebElement successfulMsg;



}
