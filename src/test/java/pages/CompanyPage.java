package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
public class CompanyPage {
    public CompanyPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "link4")
    public WebElement companyModule;
    @FindBy(xpath = "//*[ text()= ' Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameField;
    @FindBy(xpath = "//*[@name='short_name']")
    public WebElement shortNameField;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailField;
    @FindBy(xpath = "//*[@name='website']")
    public WebElement websiteField;
    @FindBy(xpath = "//*[@placeholder='Company Phone']")
    public WebElement phoneField;
    @FindBy(xpath = "//*[@placeholder='Company Fax']")
    public WebElement faxField;
    @FindBy(xpath = "//*[@name='address']")
    public WebElement addressField;
    @FindBy(id = "react-select-2-input")
    public WebElement countryField;
    @FindBy(id = "react-select-3-input")
    public  WebElement statusField;
    @FindBy(id = "react-select-4-input")
    public WebElement currencyField;
    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;
    @FindBy(id = "divCollapseUncollapse")
    public WebElement arrow;
    @FindBy (xpath = "//div[@class='toast-body']")
    public WebElement updateMessage;

    public void companyEditProcess(String name , String sortName , String email , String website , String companyPhone
                                  , String fax , String address ,String country , String status , String currency)
    {
        arrow.click();
        companyModule.click();
        editButton.click();

        // clear and add name
        nameField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nameField.clear();
        nameField.sendKeys(name);

        // clear and add short name
        shortNameField.click();
        shortNameField.clear();
        shortNameField.sendKeys(sortName);

        // clear and add E-mail
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);

        // clear and add website
        websiteField.click();
        websiteField.clear();
        websiteField.sendKeys(website);

        // clear and add phone
        phoneField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        phoneField.sendKeys(Keys.CONTROL+ "A");
        phoneField.sendKeys(Keys.DELETE);
        phoneField.sendKeys(companyPhone + Keys.ENTER);

        // clear and add fax
        faxField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        faxField.sendKeys(Keys.CONTROL+ "A");
        faxField.sendKeys(Keys.DELETE);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        faxField.sendKeys(fax + Keys.ENTER);

        // clear and add address
        addressField.click();
        addressField.clear();
        addressField.sendKeys(address);

        countryField.sendKeys(country + Keys.ENTER);
        statusField.sendKeys(status + Keys.ENTER);
        currencyField.sendKeys(currency + Keys.ENTER);

        saveButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(updateMessage.isDisplayed());
    }

    public void EditCompanyInformationWithoutName(String sortName , String email , String website , String companyPhone
            ,String fax , String address ,String country  , String status , String currency){

        arrow.click();
        companyModule.click();
        editButton.click();

        // clear name
        nameField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nameField.clear();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // clear and add short name
        shortNameField.click();
        shortNameField.clear();
        shortNameField.sendKeys(sortName);

        // clear and add E-mail
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);

        // clear and add website
        websiteField.click();
        websiteField.clear();
        websiteField.sendKeys(website);

        // clear and add phone
        phoneField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        phoneField.sendKeys(Keys.CONTROL+ "A");
        phoneField.sendKeys(Keys.DELETE);
        phoneField.sendKeys(companyPhone + Keys.ENTER);

        // clear and add fax
        faxField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        faxField.sendKeys(Keys.CONTROL+ "A");
        faxField.sendKeys(Keys.DELETE);
        faxField.sendKeys(fax + Keys.ENTER);

        // clear and add address
        addressField.click();
        addressField.clear();
        addressField.sendKeys(address);

        countryField.sendKeys(country + Keys.ENTER);
        statusField.sendKeys(status + Keys.ENTER);
        currencyField.sendKeys(currency + Keys.ENTER);

        saveButton.click();
    }

    public void EditCompanyInformationWithoutEmail(String name , String sortName, String website , String companyPhone
            , String fax , String address ,String country  , String status , String currency){

        arrow.click();
        companyModule.click();
        editButton.click();

        // clear and add name
        nameField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nameField.clear();
        nameField.sendKeys(name);

        // clear and add short name
        shortNameField.click();
        shortNameField.clear();
        shortNameField.sendKeys(sortName);

        // clear E-mail

        emailField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        emailField.clear();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // clear and add website
        websiteField.click();
        websiteField.clear();
        websiteField.sendKeys(website);

        // clear and add phone
        phoneField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        phoneField.sendKeys(Keys.CONTROL+ "A");
        phoneField.sendKeys(Keys.DELETE);
        phoneField.sendKeys(companyPhone + Keys.ENTER);

        // clear and add fax
        faxField.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        faxField.sendKeys(Keys.CONTROL+ "A");
        faxField.sendKeys(Keys.DELETE);
        faxField.sendKeys(fax + Keys.ENTER);

        // clear and add address
        addressField.click();
        addressField.clear();
        addressField.sendKeys(address);

        countryField.sendKeys(country + Keys.ENTER);
        statusField.sendKeys(status + Keys.ENTER);
        currencyField.sendKeys(currency + Keys.ENTER);

        saveButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(updateMessage.isDisplayed());
    }
}
