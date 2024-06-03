package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RolesPage {
    public RolesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "link9")
    public WebElement rolesModule;
    @FindBy(xpath = "//button[@class='btn btn-light border w-100 mw-100 text-start']")
    public List<WebElement> rolesList;
}
