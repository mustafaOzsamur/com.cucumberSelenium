package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.EditorPage2;

public class EditorStepDefinition {
    EditorPage2 editorPage2=new EditorPage2();

    @Given("kullanici new butonuna basar")
    public void kullanici_new_butonuna_basar() {
       editorPage2.newButtonu.click();
    }

    @Given("first name kutusuna {string} yazar")
    public void first_name_kutusuna_yazar(String firstName) {
       editorPage2.firstNameElementi.sendKeys(firstName);
    }
    @Given("last name kutusune {string} yazar")
    public void last_name_kutusune_yazar(String lastName) {
        editorPage2.lastNameElementi.sendKeys(lastName);
    }
    @Given("office kutusuna {string} yazar")
    public void office_kutusuna_yazar(String office) {
        editorPage2.officeElementi.sendKeys(office);
    }
    @Given("extension kutusuna {string} yazar")
    public void extension_kutusuna_yazar(String extension) {
        editorPage2.exensionElementi.sendKeys(extension);
    }
    @Then("start date kutusuna {string} yazar")
    public void start_date_kutusuna_yazar(String startDate) {
        editorPage2.startDateElementi.sendKeys(startDate);
    }
    @Then("salary kutusuna {string} yazar")
    public void salary_kutusuna_yazar(String salary) {
    editorPage2.salaryElementi.sendKeys(salary);
    }

    @Then("create butonuna basar")
    public void create_butonuna_basar() {
        editorPage2.createButtonu.click();
    }

}

