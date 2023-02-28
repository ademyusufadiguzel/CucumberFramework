package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BlueRentalCarPage;
import utilities.Driver;

public class bluerantalcarStepDefinitions {

    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentalCarPage.loginHomePage.click();
    }
    @When("kullanıcı email {string} girer")
    public void kullanıcı_email_girer(String string) {
        blueRentalCarPage.emailBox.sendKeys(string, Keys.ENTER);
    }
    @When("kullanici sifreyi {string} girer")
    public void kullanici_sifreyi_girer(String string) {
        blueRentalCarPage.passwordBox.sendKeys(string, Keys.ENTER);
    }
    @When("login buttoning basar")
    public void login_buttoning_basar() {
        blueRentalCarPage.loginLoginPage.click();
    }
    @Then("login islemi gerçekleşir")
    public void login_islemi_gerçekleşir() {
        assert blueRentalCarPage.profileButton.isDisplayed();
    }

}
