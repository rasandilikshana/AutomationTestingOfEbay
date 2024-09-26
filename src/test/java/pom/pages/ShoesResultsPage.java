package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesResultsPage extends PageBase {

    @FindBy(xpath = "//input[@aria-label='adidas']")
    public WebElement AdidasCheckBox;

    public ShoesResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAdidasCheckBox(){
        AdidasCheckBox.click();
    }
}
