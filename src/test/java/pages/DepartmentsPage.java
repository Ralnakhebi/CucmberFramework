package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class DepartmentsPage {
    public DepartmentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    String depName = ConfigReader.getProperty("departmentName");
    @FindBy(xpath = "//button[contains(text(), 'Add New')]")
    public WebElement AddNewDepartmentButton;

    public WebElement addDepartment(String department) {
        return Driver.getDriver().findElement(By.xpath("//b[text() ='" + depName + "']"));

    }
}
