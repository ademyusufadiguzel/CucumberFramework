package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarPage {

    public BlueRentalCarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "btn btn-primary btn-sm")
    public WebElement loginHomePage;

    @FindBy(id = "formBasicEmail")
    public WebElement emailBox;

    @FindBy(id = "formBasicPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginLoginPage;

    @FindBy(id = "dropdown-basic-button")
    public WebElement profileButton;

}
