package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NovoDailyPage {
    public NovoDailyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//img[@alt='Zur Startseite wechseln']")
    public WebElement novoDailyLogoElementi;

    @FindBy(xpath = "(//span[text()='Produkte'])[1]")
    public WebElement produkteEementi;

    @FindBy(id = "uc-btn-accept-banner")
    public WebElement cookiesElementi;

    @FindBy(xpath = "//span[text()='Genanalysen']")
    public WebElement genAnalysen;

    @FindBy(xpath = "//div[@class='cms-listing-col col-sm-6 col-lg-6 col-xl-4']")
    public List<WebElement> genanalysenElementListesi;

    @FindBy(xpath = "(//div[@class='d-flex justify-content-between'])[1]")
    public WebElement blutAnalysenElementi;


    @FindBy(xpath = "//div[@class='cms-listing-col col-sm-6 col-lg-6 col-xl-4']")
    public List<WebElement> blutAnalysenElementListesi;

    @FindBy(xpath = "(//div[@class='d-flex justify-content-between'])[2]")
    public WebElement nahrungsErganzungsMittel;

    @FindBy(xpath = "//div[@class='cms-listing-col col-sm-6 col-lg-6 col-xl-4']")
    public List<WebElement> nahrungsErganzungsMittelelementListesi;

    @FindBy(xpath ="(//div[@class='d-flex justify-content-between'])[4]" )
    public WebElement bundlesElementi;

    @FindBy(xpath  ="//div[@class='cms-listing-col col-sm-6 col-lg-6 col-xl-4']")
    public List<WebElement> bundlesElementListesi;

    @FindBy(xpath = "(//div[@class='d-flex justify-content-between'])[5]")
    public WebElement abosElementi;

    @FindBy(xpath = "//div[@class='cms-listing-col col-sm-6 col-lg-6 col-xl-4']")
    public List<WebElement> abosElementListesi;

    @FindBy(xpath = "//h2[text()='Alle Produkte']")
    public WebElement allaProdukteYazielementi;

    @FindBy(xpath = "//div[@class='cms-listing-col col-sm-6 col-lg-6 col-xl-4']")
    public List<WebElement> alleProdukteElementListesi;


}
