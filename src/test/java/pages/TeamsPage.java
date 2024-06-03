package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class TeamsPage {
    public WebDriverWait wait;

    public TeamsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        this.wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    }

    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//button[normalize-space()='Add New Team']")
    public WebElement AddNewTeamBut;

    @FindBy(xpath = "(//b[contains(text(),'RemoutUtest01')])[1]")
    public WebElement EditItem;

    @FindBy(xpath = "//li[contains(@id,'link7')]")
    public WebElement selectedTeamElement;




        public boolean isTeamClickable () {
            return wait.until(ExpectedConditions.elementToBeClickable(selectedTeamElement)) != null;
        }

}

