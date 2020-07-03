package pajeobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage extends basePage{

    private By macbookLink = By.xpath(
            "//*[@href=\"https://demo.opencart.com/index.php?route=product/product&product_id=45&search=macbook\"]");
    private By iphoneLink = By.xpath("//*[@title=\"iPhone\"]");

    public searchPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    @Step
    public void clickOnMacbookProItem(){

       driver.findElement(this.macbookLink).click();
    }

    @Step
    public void clickOnIphoneItem(){

        driver.findElement(this.iphoneLink).click();
    }


}
