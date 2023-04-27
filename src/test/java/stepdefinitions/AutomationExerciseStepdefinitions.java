package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

import static utilities.Driver.driver;

public class AutomationExerciseStepdefinitions {
    String kullaniciEmail;
    String kullaniciIsim;
    String password;
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    @Given("user sig in linkine tiklar")
    public void user_sig_in_linkine_tiklar() {
    automationExercisePage.signUpLinki.click();
    }
    @Given("user Create and account bolumune mail adresi girer")
    public void user_create_and_account_bolumune_mail_adresi_girer() {
    kullaniciEmail=faker.internet().emailAddress();
    kullaniciIsim=faker.name().firstName();

    automationExercisePage.nameKutusu.sendKeys(kullaniciIsim);
    automationExercisePage.emailKutusu.sendKeys(kullaniciEmail);

    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationExercisePage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        password=faker.internet().password();
        actions.click(automationExercisePage.mrRadioButonu)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1985")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Teksas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("06123")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .perform();

    }
    @Given("user register butonuna basar")
    public void user_register_butonuna_basar() {
    automationExercisePage.createButton.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(automationExercisePage.accountCreatedYaziElementi.isDisplayed());


    }

    @Then("Ana sayfanin basariyla gorundugunu dogrulalar")
    public void ana_sayfanin_basariyla_gorundugunu_dogrulalar() {
        Assert.assertTrue(automationExercisePage.anasayfaDogrulamaLogosu.isDisplayed());
    }
    @Then("Sayfayi asagiya dogru kaydirin")
    public void sayfayi_asagiya_dogru_kaydirin() {


        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

    }
    @Then("ABONELİK in gorunur oldugunu dogrulayin")
    public void aboneli̇k_in_gorunur_oldugunu_dogrulayin() {
        Assert.assertTrue(automationExercisePage.abonelikYaziElementi.isDisplayed());

    }
    @Then("Sayfayi yukari kaydir")
    public void sayfayi_yukari_kaydir() {

        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
    }
    @Then("Sayfanin yukari kaydirildigini ve Otomasyon Muhendisleri icin Tam Tesekkullu uygulama web sitesi metninin ekranda gorundugunu dogrulayin")
    public void sayfanin_yukari_kaydirildigini_ve_otomasyon_muhendisleri_icin_tam_tesekkullu_uygulama_web_sitesi_metninin_ekranda_gorundugunu_dogrulayin() {

        Assert.assertTrue(automationExercisePage.sayfaBasiYazielementi.isDisplayed());


    }
    @Then("dogru email ve password girerek login butonuna tikla")
    public void dogru_email_ve_password_girerek_login_butonuna_tikla() {
        automationExercisePage.loginEmailKutusu.sendKeys(ConfigReader.getProperty("automationGecerliEmail"));
        automationExercisePage.loginPasswordKutusu.sendKeys(ConfigReader.getProperty("automationGecerliPassword"));
        automationExercisePage.loginButtonu.click();
    }
    @Then("sepete urun ekle")
    public void sepete_urun_ekle() {
    actions.moveToElement(automationExercisePage.urunElementi).perform();
    automationExercisePage.urunElementi.click();
    }
    @Then("cart butonuna click yap")
    public void cart_butonuna_click_yap() {
    automationExercisePage.urunSepetiElementi.click();
    }
    @Then("cart sayfasinda urununun eklendigini dogrula")
    public void cart_sayfasinda_urununun_eklendigini_dogrula() {
    Assert.assertTrue(automationExercisePage.sepeticindekiUrunElementi.isDisplayed());
    }
    @Then("proceed To Checkout click yap")
    public void proceed_to_checkout_click_yap() {
    automationExercisePage.proceedToCheckoutButtonu.click();
    }
    @Then("adres ayrintilarini dogrula ve siparisi incele")
    public void adres_ayrintilarini_dogrula_ve_siparisi_incele() {

        Assert.assertTrue(automationExercisePage.adresBilgileriYaziElementi.getText().contains("mustafa"));
    }
    @Then("aciklama metin alanina aciklamayi girin ve Place Order tiklayin")
    public void aciklama_metin_alanina_aciklamayi_girin_ve_place_order_tiklayin() {
        actions.moveToElement(automationExercisePage.mesageElementi).perform();
    automationExercisePage.mesageElementi.sendKeys("Lütfen hizli olsun");
    automationExercisePage.placeOrderElementi.click();

      //  WebElement element = Driver.getDriver().findElement(By.xpath("//span[text()='Close']"));
      //  JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
      //  executor.executeScript("arguments[0].click();", element);

      //  Driver.getDriver().switchTo().alert().dismiss();



    }
    @Then("odeme ayrintilarini girin")
    public void odeme_ayrintilarini_girin() {
     //   Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("ad_iframe")));
     //   Driver.getDriver().findElement(By.id("dismiss-button")).click();
     //   Driver.getDriver().switchTo().defaultContent();

        driver.switchTo().defaultContent();

        actions.click(automationExercisePage.cardNameElementi).sendKeys("mustafa yilmaz")
                .sendKeys(Keys.TAB)
                .sendKeys("8568658685875")
                .sendKeys(Keys.TAB)
                .sendKeys("456")
                .sendKeys(Keys.TAB)
                .sendKeys("11")
                .sendKeys(Keys.TAB)
                .sendKeys("2023").perform();


    }
    @Then("pay and Confirm Order click yap")
    public void pay_and_confirm_order_click_yap() {

        automationExercisePage.submitButtonElementi.click();
    }
    @Then("your order has been placed successfully! yazisinin gorundugunu dogrulayin")
    public void your_order_has_been_placed_successfully_yazisinin_gorundugunu_dogrulayin() {
    Assert.assertTrue(automationExercisePage.yourOrderHasBeenPlacedSuccessfullyYaziElementi.isDisplayed());
    }
    @Then("delete Account butonuna click yapin")
    public void delete_account_butonuna_click_yapin() {

    }
    @Then("ACCOUNT DELETED yazisinin göründügünü dogrulayin")
    public void account_deleted_yazisinin_göründügünü_dogrulayin() {

    }
    @Then("continue butonuna click yap")
    public void continue_butonuna_click_yap() {

    }



}
