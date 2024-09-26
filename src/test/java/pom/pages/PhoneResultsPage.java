package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhoneResultsPage extends PageBase{

    @FindBy(xpath = "//input[@aria-label='Apple']")
    public WebElement AppleCheckBox;

    public PhoneResultsPage(WebDriver driver){
        super(driver);
    }

    public void clickAppleCheckBox(){
        AppleCheckBox.click();
    }
}
