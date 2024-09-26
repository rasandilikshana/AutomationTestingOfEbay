package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHome extends PageBase{

    String visibleText;

    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement SearchBox;

    @FindBy(xpath = "//select[@id='gh-cat']")
    WebElement DropDown;

    @FindBy(xpath = "//input[@id='gh-btn']")
    WebElement SearchButton;

    public EbayHome(WebDriver driver){
        super(driver);
    }

    public void insertTextToSearch(String searchText){
        SearchBox.sendKeys(searchText);
    }

    public void selectCategoryByVisibleText(String visibleText){
        this.visibleText = visibleText;
        new Select(DropDown).selectByVisibleText(visibleText);
    }

    public <T> T clickSearchButton(){
        SearchButton.click();

        if(visibleText.equals("Cell Phones & Accessories")){
            return (T)PageFactory.initElements(driver, PhoneResultsPage.class);
        }else {
            return (T)PageFactory.initElements(driver, ShoesResultsPage.class);
        }
    }
}
