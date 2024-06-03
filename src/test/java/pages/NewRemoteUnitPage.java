package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static java.lang.Thread.sleep;


public class NewRemoteUnitPage {
    public NewRemoteUnitPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#/departments/remote']")
    public WebElement clickRemoteUnitPage;

    @FindBy(xpath = "//*[@class='btn btn-info float-end text-white']")
    public WebElement clickOnaddNewRemoteUnit;

    @FindBy(id="name")
    public WebElement nameFeild;

    @FindBy(xpath = "//*[@id='react-select-2-input']")
    public WebElement editeRemoteUnitType;

    @FindBy(xpath = "//*[@class='btn btn-info text-white px-3']")
    public WebElement Savebutton;

    @FindBy(xpath = "//*[text()='Please enter a name for department']")
    public WebElement RemoteNameError;

    @FindBy(xpath = "//*[text()='Please select a type for department']")
    public WebElement RemoteTypeError;


    public void clickOnRemoteunit() {
        clickRemoteUnitPage.click();
    }


    public void clickOnaddNewRemoteUnitButton() {
        clickOnaddNewRemoteUnit.click();    }




    public  void clickOnRemotType() throws InterruptedException {
        sleep(2000);
//        editeRemoteUnitType.click();
        editeRemoteUnitType.sendKeys("R"+ Keys.ENTER);
    }

}
