package pajeobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class headerPage extends basePage{

    private By myAccountLink = By.xpath("//*[@title=\"My Account\"]");
    private By registerLink = By.linkText("Register");
    private By loginLink = By.linkText("Login");
    private By searchBar = By.id("search");
    private By sendTextToSearchProduct = By.xpath("//*[@name=\"search\"]");
    private By searchButton = By.xpath("//*[@class=\"input-group-btn\"]");
    private By openCartButton = By.id("cart");
    private By goToCartLink = By.xpath("//*[@href=\"https://demo.opencart.com/index.php?route=checkout/cart\"]");
    private By currenciesDropdown = By.xpath("//*[@class=\"hidden-xs hidden-sm hidden-md\"]");
    private By selectEuroCurrency = By.xpath("//*[@name=\"EUR\"]");
    private By selectPoundSterlingCurrency = By.xpath("//*[@name=\"GBP\"]");
    private By selectDollarCurrency = By.xpath("//*[@name=\"USD\"]");

    public headerPage(String _pageURL, WebDriver _driver) {

        super(_pageURL, _driver);
    }

    public WebElement setAccountLink(){
        return driver.findElement(this.myAccountLink);
    }
    public void clickMyAccountLink(){
        setAccountLink().click();
    }

    public void clickRegisterLink(){
        driver.findElement(this.registerLink).click();
    }

    public void clickLoginLink(){
        driver.findElement(this.loginLink).click();
    }

    public void clickOnSearchBar(){

        driver.findElement(this.searchBar).click();
    }

    public void insertSearchCriteria(String searchItem){

        driver.findElement(this.sendTextToSearchProduct).sendKeys(searchItem);
    }

    public void clickOnSearchButton(){

        driver.findElement(this.searchButton).click();
    }

    @Step
    public void clickOnCartButton(){

        driver.findElement(this.openCartButton).click();
    }

    @Step
    public void clickOnGoToCartLink(){

        driver.findElement(this.goToCartLink).click();
    }

    @Step
    public void clickOnCurrenciesDropDown(){

        driver.findElement(this.currenciesDropdown).click();
    }

    @Step
    public void clickOnEuroCurrency(){

        driver.findElement(this.selectEuroCurrency).click();
    }

    @Step
    public void clickOnPoundSterlingCurrency(){

        driver.findElement(this.selectPoundSterlingCurrency).click();
    }

    @Step
    public void clickOnDollarCurrency(){

        driver.findElement(this.selectDollarCurrency).click();
    }

    @Step
    public void goToLogin(){
        this.clickMyAccountLink();
        this.clickLoginLink();
    }

    @Step
    public void goToRegister(){
        this.clickMyAccountLink();
        this.clickRegisterLink();
    }

    @Step
    public void searchItem(String searchItem){

        clickOnSearchBar();
        insertSearchCriteria(searchItem);
        clickOnSearchButton();
    }
}
