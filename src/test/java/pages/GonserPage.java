package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GonserPage {

    public GonserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loginButtonu;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-appearance btn-medium']")
    public WebElement ikinciLoginButtonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchElementi;

    @FindBy(xpath = "//span[text()='Gartenmöbel Tisch 200 cm + 8 Stühle anthrazit']")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//button[@class='btn btn-block btn-primary btn-appearance']")
    public WebElement sepeteEkelemeLinki;

    @FindBy(xpath = "//div[@class='modal-body singleoverlaybtn']")
    public WebElement kasaElementi;

    @FindBy(xpath = "//span[@class='d-inline-block mr-2']")
    public WebElement urunElementi;

    @FindBy(xpath = "//div[@class='price']")
    public WebElement fiyatElementi;

    @FindBy(xpath = "//button[@class='btn btn-sm item-remove-button']")
    public WebElement deleteButtonu;

    @FindBy(xpath = "(//span[text()='0'])[2]")
    public WebElement urunSepetiElementi;


}
