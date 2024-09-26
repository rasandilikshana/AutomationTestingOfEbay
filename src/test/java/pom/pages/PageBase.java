package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public EbayHome loadURL(String url){
        driver.get(url);
        //Return ebay home page
        return PageFactory.initElements(driver, EbayHome.class);
    }

    public void scrollPage(int x, int y){
        new Actions(driver).scrollByAmount(x, y).perform();
    }

}
