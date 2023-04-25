package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameKutusu;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailKutusu;

    @FindBy (xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement signUpButonu;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement mrRadioButonu;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;

   @FindBy(xpath = "//div[@class='logo pull-left']")
    public WebElement anasayfaDogrulamaLogosu;

   @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement abonelikYaziElementi;

   @FindBy(xpath = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]")
    public WebElement sayfaBasiYazielementi;
}
