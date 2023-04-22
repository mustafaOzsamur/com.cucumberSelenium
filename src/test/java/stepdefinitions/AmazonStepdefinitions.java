package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class AmazonStepdefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("amazon arama kutusuna Nutella Yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage=new AmazonPage();
    amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
    String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
    String expectedKelime="Nutella";

    Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }

    @Then("amazon arama kutusuna Java Yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
         amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("amazon arama kutusuna Samsung Yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Samsung";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }

    @Then("amazon arama kutusuna {string} Yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+Keys.ENTER);

    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String gidilecekUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekUrl));
    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {
        String actualUrl=Driver.driver.getCurrentUrl();

      Assert.assertTrue(actualUrl.contains(arananKelime));

    }

    @And("sacilan tüm sayfalari kapatir")
    public void sacilanTumSayfalariKapatir() {
        Driver.quitDriver();
    }

    @And("cikan urunler icinde {string}oldugunu test eder")
    public void cikanUrunlerIcindeOldugunuTestEder(String arananUrun) {

        List<WebElement> sonucUrunElementleriList=amazonPage.sonucUrunIsimElementleriList;

        List<String>sonucUrunIsimleriListStr= ReusableMethods.getElementsText(sonucUrunElementleriList);

     //   Assert.assertTrue(sonucUrunIsimleriListStr.contains(arananUrun));

        boolean iceriyorMu=false;


   //           1.Yöntem
  //      for (String each:sonucUrunIsimleriListStr
  //           ) {
  //          if (each.contains(arananUrun)) {
  //              iceriyorMu=true;
  //              break;
  //          }
  //      }
  //      Assert.assertTrue(iceriyorMu);


        // 2.yöntem
        for (WebElement each:sonucUrunElementleriList
             ) {
            if (each.getText().contains(arananUrun)){
                iceriyorMu=true;
            }
        }

        Assert.assertTrue(iceriyorMu);
    }

    @And("cikan urunlerden {string} kelimesi icerenlerin fiyat ortalamasinin {int} Euro altinda oldugunu test eder")
    public void cikanUrunlerdenKelimesiIcerenlerinFiyatOrtalamasininEuroAltindaOldugunuTestEder(String arananUrun, int ortalamaFiyat) {
        List<WebElement> aramaSonucDetayliIsimElementleriList=amazonPage.aramaSonucDetayliIsimElementleriList;

        for (WebElement each:aramaSonucDetayliIsimElementleriList
             ) {
            System.out.println(each.getText());
        }
    }
}

