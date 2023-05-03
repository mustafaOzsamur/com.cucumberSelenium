package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GonserPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GonserStepdefinitions {
    GonserPage gonserPage=new GonserPage();

    @And("kullanici login buttonuna click yapar")
    public void kullaniciLoginButtonunaClickYapar() {
        gonserPage.loginButtonu.click();
    }
    @Given("kullanici mail kutusuna gecerili {string} yazar")
    public void kullanici_mail_kutusuna_gecerili_yazar(String string) {
    gonserPage.emailKutusu.sendKeys(ConfigReader.getProperty("gonserGecerliEmail"));
    }
    @Given("kullanici password kutusuna gecerli {string} yazar")
    public void kullanici_password_kutusuna_gecerli_yazar(String string) {
    gonserPage.passwordKutusu.sendKeys(ConfigReader.getProperty("gonserGecerliPassword"));
    }

    @Then("login buttonuna tiklar")
    public void loginButtonunaTiklar() {
        gonserPage.ikinciLoginButtonu.click();
        ReusableMethods.bekle(3);
    }
    @Given("urunler bolumunde {string} aratir")
    public void urunler_bolumunde_aratir(String stühle) {
        gonserPage.searchElementi.sendKeys(stühle + Keys.ENTER);

    }
    @Given("ilk buldugu urunu urun sepetine ekler")
    public void ilk_buldugu_urunu_urun_sepetine_ekler() {
    gonserPage.ilkUrunElementi.click();
    gonserPage.sepeteEkelemeLinki.click();
    }
    @Given("urun sepetini tiklar")
    public void urun_sepetini_tiklar() {
    gonserPage.kasaElementi.click();
    }
    @Given("urunun eklendigini dogrular")
    public void urunun_eklendigini_dogrular() {
        Assert.assertTrue(gonserPage.urunElementi.isDisplayed());
    }
    @Given("urun fiyatini dogrular")
    public void urun_fiyatini_dogrular() {
        String fiyatStr=gonserPage.fiyatElementi.getText();
        String [] fiyatArr=fiyatStr.split(" ");
        fiyatStr=fiyatArr[1];
        fiyatStr=fiyatStr.replace(".","");
        int fiyatInt=Integer.parseInt(fiyatStr);
        fiyatInt=fiyatInt/100;
        Assert.assertEquals(699,fiyatInt);

    }
    @Given("urunu sepetten cikarir")
    public void urunu_sepetten_cikarir() {
        gonserPage.deleteButtonu.click();

    }
    @Then("urunun sepetten cikarildigini dogrular")
    public void urunun_sepetten_cikarildigini_dogrular() {
    String actualUrunSepetiYazi=gonserPage.urunSepetiElementi.getText();
    int actualUrunSepetiInt=Integer.parseInt(actualUrunSepetiYazi);
    int expectedUrunSepetiInt=0;

    Assert.assertEquals(expectedUrunSepetiInt,actualUrunSepetiInt);



    }



}
