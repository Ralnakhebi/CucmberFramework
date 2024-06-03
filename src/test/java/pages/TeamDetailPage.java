package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeamDetailPage {

    public TeamDetailPage(){
        PageFactory.initElements(Driver.getDriver() ,this);
        //this.wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    }

    @FindBy(xpath = "//button[normalize-space()='Edit Team']")
    public WebElement EditTeamButton;

}
