package browser_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoadUrl {
    WebDriver driver;
    @BeforeMethod
    public void initializeBrowser(){
        //Create a browser instance
        //driver = new ChromeDriver();
        driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
        driver.manage().window().maximize();

    }

    @Test
    public void search_watersports_items(){
        driver.get("https://ebay.com/");
        WebElement sports_items = driver.findElement(By.xpath("//ul[@class='vl-flyout-nav__container']/li[7]/a"));
        new Actions(driver).moveToElement(sports_items).perform();

        // //ul[@class='vl-flyout-nav__container']/li[7]/a
        // //ul[@class='vl-flyout-nav__container']/li/child::a[text()='Sports']
        // //ul/li/child::a[text()='Sports']
    }

    @Test(enabled = false)
    public void search_apple_phones(){
        //Load a url in the browser
        driver.get("https://ebay.com/");
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phones");

        // Implement select
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Cell Phones & Accessories");

        //new Select(driver.findElement(By.xpath("//select[@id='gh-cat']"))).selectByVisibleText("Cell Phones & Accessories");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        Actions scroll = new Actions(driver);
        scroll.scrollByAmount(0, 300).perform();

        driver.findElement(By.xpath("//input[@aria-label='Apple']")).click();

    }

    @AfterMethod
    public void closeBrowser(){
        //driver.close();
    }

}
