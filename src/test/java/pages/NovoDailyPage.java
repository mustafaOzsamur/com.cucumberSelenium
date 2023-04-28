package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NovoDailyPage {
    public NovoDailyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//img[@alt='Zur Startseite wechseln']")
    public WebElement novoDailyLogoElementi;


}
