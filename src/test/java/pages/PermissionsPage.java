package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PermissionsPage {


    public PermissionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // xpath for permissions
    @FindBy(xpath = "//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2']")
    public List<WebElement> permissions;

}
