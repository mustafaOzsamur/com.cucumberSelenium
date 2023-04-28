package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.NovoDailyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NovoDailyStepdefinitions {

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

}
