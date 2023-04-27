package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QDemiyPage;

public class QDemyStepdefinitions {

    QDemiyPage qDemiyPage=new QDemiyPage();
    @Then("kullanici logIn butonuna tiklar")
    public void kullanici_log_in_butonuna_tiklar() {
    qDemiyPage.logiInButtonu.click();
    }
    @Then("email kutusuna {string} girer")
    public void email_kutusuna_girer(String email) {
    qDemiyPage.EmailKutusu.sendKeys(email);
    }
    @Then("password kutusuna {string} girer")
    public void password_kutusuna_girer(String password) {
    qDemiyPage.passwordKutusu.sendKeys(password);
    }
    @Then("login butonuna click yaparr")
    public void login_butonuna_click_yaparr() {
    qDemiyPage.ikinciLoginElementi.click();
    }
    @Then("basarili giris yapilmadigini test eeder")
    public void basarili_giris_yapilmadigini_test_eeder() {
        Assert.assertTrue(qDemiyPage.EmailKutusu.isDisplayed());
    }
}
