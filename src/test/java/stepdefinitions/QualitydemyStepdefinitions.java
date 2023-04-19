package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyStepdefinitions {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
       qualitydemyPage.ilkLoginLinki.click();
    }
    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUserName) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUserName));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
       qualitydemyPage.kullaniciPasswordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
    }
    @Then("login butonuna click yapar")
    public void login_butonuna_click_yapar() {
       qualitydemyPage.loginButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }

    @And("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String UserName) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(UserName);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String Password) {
        qualitydemyPage.kullaniciPasswordKutusu.sendKeys(Password);
    }
}
