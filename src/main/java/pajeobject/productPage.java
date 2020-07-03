package pajeobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage extends basePage{

    private By addToCartButton = By.id("button-cart");
    private By itemAddedSuccessfullyToShoppingCart = By.xpath("//*[@class=\"alert alert-success alert-dismissible\"]");
    private By searchedItem = By.xpath("//*[@id=\"content\"]/h1");
    private By currencyValue = By.xpath("//ul[@class=\"list-unstyled\"]/li/h2");

    public productPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement addedItemToCartMessage(){

        return driver.findElement(this.itemAddedSuccessfullyToShoppingCart);
    }

    public WebElement assertSearchedItem(){

        return driver.findElement(this.searchedItem);
    }

    public WebElement returnCurrencyValue(){

        return driver.findElement(this.currencyValue);
    }

    @Step
    public void clickOnAddToCartButton(){

        driver.findElement(this.addToCartButton).click();
    }
}
