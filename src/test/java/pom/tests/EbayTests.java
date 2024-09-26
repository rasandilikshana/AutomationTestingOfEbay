package pom.tests;
import org.openqa.selenium.By;

import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNGUtils;


import org.testng.annotations.Test;
import pom.pages.EbayHome;
import pom.pages.PageBase;
import pom.pages.PhoneResultsPage;
import pom.pages.ShoesResultsPage;
import pom.utilities.TestNGUtil;

import javax.naming.ldap.PagedResultsControl;

public class EbayTests extends TestNGUtil {

    //methods are important
    @Test
    public void searchMobilePhones(){
        PageBase pageBase = PageFactory.initElements(driver, PageBase.class);
        EbayHome ebayHome = pageBase.loadURL("https://www.ebay.com/");
        ebayHome.insertTextToSearch("mobile phones");
        ebayHome.selectCategoryByVisibleText("Cell Phones & Accessories");
        PhoneResultsPage phoneResultsPage = ebayHome.clickSearchButton();
        phoneResultsPage.scrollPage(0, 300);
        phoneResultsPage.clickAppleCheckBox();
    }

    @Test
    public void searchShoes(){
        PageBase pageBase = PageFactory.initElements(driver, PageBase.class);
        EbayHome ebayHome = pageBase.loadURL("https://www.ebay.com/");
        ebayHome.insertTextToSearch("shoes");
        ebayHome.selectCategoryByVisibleText("Clothing, Shoes & Accessories");
        ShoesResultsPage shoesResultsPage = ebayHome.clickSearchButton();
        shoesResultsPage.scrollPage(0, 300);
        shoesResultsPage.clickAdidasCheckBox();
    }
}
