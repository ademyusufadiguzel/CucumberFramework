package stepdefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import pages.BlueRentCarPage;
import utilities.Driver;

public class BlueRentalCar {

    BlueRentCarPage blueRentCarPage = new BlueRentCarPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentCarPage.loginHomePage.click();
    }
    @When("kullanici email {string} girer")
    public void kullanici_email_girer(String string) {
        blueRentCarPage.emailBox.sendKeys(string, Keys.ENTER);
    }
    @When("kullanici sifreyi {string} girer")
    public void kullanici_sifreyi_girer(String string) {
        blueRentCarPage.passwordBox.sendKeys(string, Keys.ENTER);
    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        Driver.clickWithJS(blueRentCarPage.loginLoginPage);
    }
    @Then("login islemi gerceklesir")
    public void login_islemi_gerceklesir() {
        Driver.waitForVisibility(blueRentCarPage.profileButton,5);
    }

    @Then("close driver")
    public void close_driver() {
        Driver.closeDriver();
    }

}
