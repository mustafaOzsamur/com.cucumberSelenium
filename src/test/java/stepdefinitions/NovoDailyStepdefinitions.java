package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.NovoDailyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class NovoDailyStepdefinitions {
 Actions actions=new Actions(Driver.getDriver());

   int kategorilerdebulunanUrunAdediToplami=0;
    int butunUrunlerunUrunAdediToplami=0;

    NovoDailyPage novoDailyPage=new NovoDailyPage();
    @Given("Go to the {string} NovoDaily website.")
    public void go_to_the_novo_daily_website(String sayfaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("ndUrl"));
    }
    @Then("wait for the homepage to load for {int} seconds.")
    public void wait_for_the_homepage_to_load_for_seconds(Integer bekle) {
        ReusableMethods.bekle(5);
    }
    @Then("Click on the {string} font logo.")
    public void click_on_the_font_logo(String logo) {
    novoDailyPage.novoDailyLogoElementi.click();
    }
    @Then("Verify that the NovoDaily logo is displayed on the homepage.")
    public void verify_that_the_novo_daily_logo_is_displayed_on_the_homepage() {
        Assert.assertTrue(novoDailyPage.novoDailyLogoElementi.isDisplayed());
    }
    @Then("close the browser")
    public void close_the_browser() {
    Driver.closeDriver();
    }

 @And("cookies kabul eder")
 public void cookiesKabulEder() {
novoDailyPage.cookiesElementi.click();
 }

    @Given("mausu produkte linkinin uzerinde bekletir")
    public void mausu_produkte_linkinin_uzerinde_bekletir() {
    actions.moveToElement(novoDailyPage.produkteEementi).perform();

    }


    @Given("produkta altinda acilan genanalsyen linkine tiklar ve burda bulunan urun sayisini alir")
    public void produkta_altinda_acilan_genanalsyen_linkine_tiklar_ve_burda_bulunan_urun_sayisini_alir() {
     novoDailyPage.genAnalysen.click();
     kategorilerdebulunanUrunAdediToplami+=novoDailyPage.genanalysenElementListesi.size();
    }

    @Given("blutanalsyen linkine tiklar buradaki urunlerin sayisini alir")
    public void blutanalsyen_linkine_tiklar_buradaki_urunlerin_sayisini_alir() {
    novoDailyPage.blutAnalysenElementi.click();
    kategorilerdebulunanUrunAdediToplami+=novoDailyPage.blutAnalysenElementListesi.size();
    }
    @Given("nahrungerganzungsmittel linkine tiklar ve urun sayisini alir")
    public void nahrungerganzungsmittel_linkine_tiklar_ve_urun_sayisini_alir() {
    novoDailyPage.nahrungsErganzungsMittel.click();
    kategorilerdebulunanUrunAdediToplami+=novoDailyPage.nahrungsErganzungsMittelelementListesi.size();
    }
    @Then("bundles sayfasindaki urun sayisini alir")
    public void bundles_sayfasindaki_urun_sayisini_alir() {
    novoDailyPage.bundlesElementi.click();
    kategorilerdebulunanUrunAdediToplami+=novoDailyPage.bundlesElementListesi.size();
    }
    @Then("abos sayfasindaki urun sayisini alir")
    public void abos_sayfasindaki_urun_sayisini_alir() {
     novoDailyPage.abosElementi.click();
     kategorilerdebulunanUrunAdediToplami+=novoDailyPage.abosElementListesi.size();

    }
    @Then("produkte linkine tiklar {string} yazisinin görünür oldugunu dogrular")
    public void produkte_linkine_tiklar_yazisinin_görünür_oldugunu_dogrular(String string) {
    actions.moveToElement(novoDailyPage.produkteEementi).click(novoDailyPage.produkteEementi).perform();
    novoDailyPage.produkteEementi.click();
    Assert.assertTrue(novoDailyPage.allaProdukteYazielementi.isDisplayed());

    }
    @Then("bu sayfada bulunan urun sayisini alir ve diger alinan urun sayilarinin toplami ile ayni oldugunu dogrular")
    public void bu_sayfada_bulunan_urun_sayisini_alir_ve_diger_alinan_urun_sayilarinin_toplami_ile_ayni_oldugunu_dogrular() {

    Assert.assertEquals(kategorilerdebulunanUrunAdediToplami,novoDailyPage.alleProdukteElementListesi.size());


    }


}
