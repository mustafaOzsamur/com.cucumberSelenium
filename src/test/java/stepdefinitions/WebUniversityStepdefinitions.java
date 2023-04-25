package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinitions {

WebUniversityPage webUniversityPage=new WebUniversityPage();
Faker faker=new Faker();
String ilkSayfaWHD;
    @Then("Login Portal elementine kadar asagiya iner")
    public void login_portal_elementine_kadar_asagiya_iner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(webUniversityPage.loginPortalElementi).build().perform();
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaWHD=Driver.getDriver().getWindowHandle();
    webUniversityPage.loginPortalElementi.click();
    }
    @Then("Acila yeni window agecer")
    public void acila_yeni_window_agecer() {
    // eger yeni window a geciyorsa, yeni window acilmadan ilk sayfanin windowhandle  degerini
        // kayitetmeliyiz

        Set<String> windowHandlesSeti= Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD="";
        for (String eachWHD:windowHandlesSeti
             ) {
            if (!eachWHD.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
    }
    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
    webUniversityPage.userNameKutusu.sendKeys(faker.name().username());
    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webUniversityPage.passwordKutusu.sendKeys(faker.internet().password());

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
     webUniversityPage.loginButonu.click();
    }
    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
     String actualPopUpYazi=Driver.getDriver().switchTo().alert().getText();
     String expectedYazi="validation failed";
        Assert.assertEquals(actualPopUpYazi, expectedYazi);
    }
    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
     Driver.getDriver().switchTo().alert().accept();
    }
    @Then("ilk sayfaya geri döner")
    public void ilk_sayfaya_geri_döner() {
    Driver.getDriver().switchTo().window(ilkSayfaWHD);
    }
    @Then("ilk sayfaya dondugunun test eder")
    public void ilk_sayfaya_dondugunun_test_eder() {
    Assert.assertTrue(webUniversityPage.contactUsElementi.isDisplayed());
    }


}
