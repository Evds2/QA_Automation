package pajeobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage extends basePage {

    private By checkingItemTable = By.xpath("//*[@class=\"table-responsive\"]");

    public cartPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement itemAddedToCartPage(){

        return driver.findElement(this.checkingItemTable);
    }
}
