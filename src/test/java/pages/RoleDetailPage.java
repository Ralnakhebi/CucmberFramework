package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RoleDetailPage {
    public RoleDetailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Role Information']")
    public WebElement roleInfoTitle;
    @FindBy(xpath = "//*[@class='col-lg-4 col-md-4 col-sm-6 col-12 d-grid mb-2']")
    public List<WebElement> permissionsList;

}
