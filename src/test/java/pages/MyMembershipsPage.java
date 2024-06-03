package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class MyMembershipsPage {
    public MyMembershipsPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "link2")
    public WebElement membershipModule;

    @FindBy(xpath = "//*[@id='MainContent']/div/div[2]/div/a")
    public WebElement membershipBox;

    @FindBy(xpath = "//*[@class='avatar bg-danger text-white']")
    public WebElement profileLogo;

    @FindBy(xpath = "//a[@class='dropdown-item' and text()='My Memberships']")
    public WebElement membershipOption;

    @FindBy(xpath = "//*[@id='MainContent']/div/div/div/h5")
    public WebElement membershipInformation;

    @FindBy(id = "divCollapseUncollapse")
    public WebElement arrow;

    public void displayMembershipFirstTC() throws InterruptedException {

        Thread.sleep(2000);
        arrow.click();
        Thread.sleep(2000);
        membershipModule.click();
        Thread.sleep(2000);
        membershipBox.click();
        Thread.sleep(2000);

        Assert.assertTrue(membershipInformation.isDisplayed());
    }

    public void displayMembershipSocTC() throws InterruptedException {

        Thread.sleep(2000);
        profileLogo.click();
        Thread.sleep(2000);
        membershipOption.click();
        Thread.sleep(2000);
        membershipBox.click();

        Assert.assertTrue(membershipInformation.isDisplayed());
    }
}
