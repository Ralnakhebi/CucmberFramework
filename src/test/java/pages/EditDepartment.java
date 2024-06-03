package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static java.lang.Thread.sleep;

public class EditDepartment {

//        //_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_

    public EditDepartment() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "link5")
    public WebElement department;
    @FindBy(xpath = "//*[text()='SDA_Group1']")

    public WebElement clikonUS_0009dep;

    @FindBy(xpath = "//*[text()='US_0009TC1']")

    public WebElement clikonUS_0009TC1;



    @FindBy(xpath = "//*[contains(text(),'Edit')]")
    public WebElement clickOnEditebuttn;

    //  identify  the Locaters
    @FindBy(xpath = "//input[@class='form-control fw-bold' and @id='name']")
    public WebElement EmptyName;

    @FindBy(xpath = "//input[@class='form-control fw-bold' and @id='name']")
    public WebElement editName;

    @FindBy(id = "name")
    public WebElement nameFeild;


    @FindBy(xpath = "//*[@id='react-select-2-input']")
    public WebElement editeDepartmentType;


    @FindBy(xpath = "//*[@class='btn btn-info text-white px-3']")
    public WebElement Savebutton;

    @FindBy(xpath = "//*[@name='group_type_id'and value='1']")
    public WebElement selectFromDropdown;


    @FindBy(xpath = "//*[text()='Delete Department']")
    public WebElement DeleteButton;

    @FindBy(xpath = "//*[text()='Confirm']")
    public WebElement Deleteconformation;


    @FindBy(xpath = "//*[text()='Please select a type for department']")
    public WebElement DepartmentTypeError;

    @FindBy(xpath = "//*[text()='Please enter a name for department']")
    public WebElement DepartmentNameError;

    @FindBy(xpath = "(//div[contains(@class, 'css-1xc3v61-indicatorContainer')])[1]")
    public WebElement CancelTheDpartmentType;


//        //_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_
//        //_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_

    //______________________________________________________________________________________//

    public void clickOnDepartment() {
        department.click();
    }

    public void CancelTheDpartmentTypetocancel() {
        CancelTheDpartmentType.click();
    }


    public void NameeditingFeild() throws InterruptedException {
//        sleep(1000);
        editName.click();
        editName.clear();
        editName.sendKeys("US_0009TC1");
    }
    //______________________________________________________________________________________//

    public void clickOnDepartmentType() throws InterruptedException {
        sleep(2000);
        editeDepartmentType.click();
        editeDepartmentType.sendKeys("D" + Keys.ENTER);
    }


    public void clickOnDepartmentTypeTmBeEmpty() throws InterruptedException {
        sleep(2000);
        CancelTheDpartmentType.click();
//        editeDepartmentType.sendKeys(""+ Keys.ENTER);
    }
    //______________________________________________________________________________________//


    public void clickOnDelButton() throws InterruptedException {

        DeleteButton.click();
        sleep(2000);
        Deleteconformation.click();

    }
    //______________________________________________________________________________________//


    public void doubleClickAndPressEnter() throws InterruptedException {
//        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitForClickablility(EmptyName,10).click();
        EmptyName.clear();
        EmptyName.sendKeys("" + Keys.ENTER);
        Actions actions = new Actions(Driver.getDriver());
    }
    //______________________________________________________________________________________//

//        //_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_
//        //_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_


}
