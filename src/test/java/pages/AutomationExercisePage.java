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

   @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailKutusu;

   @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordKutusu;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement loginButtonu;

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement urunElementi;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement urunSepetiElementi;

    @FindBy(xpath = "//a[text()='Blue Top']")
    public WebElement sepeticindekiUrunElementi;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButtonu;

    @FindBy(xpath = "(//li[@class='address_firstname address_lastname'])[1]")
    public WebElement adresBilgileriYaziElementi;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement mesageElementi;

    @FindBy(xpath = "//a[text()='Place Order']")
    public WebElement placeOrderElementi;

    @FindBy (xpath = "//input[@name='name_on_card']")
    public WebElement cardNameElementi;

    @FindBy(id = "submit")
    public WebElement submitButtonElementi;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement yourOrderHasBeenPlacedSuccessfullyYaziElementi;

    @FindBy(xpath = "//iframe[@title='Advertisement']")
    public WebElement iframeReklamElementi;

    @FindBy(xpath = "//span[text()='Close']")
    public WebElement closeReklamElementi;

}
