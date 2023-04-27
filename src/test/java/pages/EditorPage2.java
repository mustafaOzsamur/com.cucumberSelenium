package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage2 {
    public EditorPage2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButtonu;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameElementi;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameElementi;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionElementi;

    @FindBy(id = "DTE_Field_office")
    public WebElement officeElementi;

    @FindBy(id = "DTE_Field_extn")
    public WebElement exensionElementi;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDateElementi;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryElementi;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButtonu;
}
