package pajeobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {

    public String pageURL;
    public WebDriver driver;

    public basePage(String _pageURL, WebDriver _driver) {
        this.pageURL = _pageURL;
        this.driver = _driver;

    }

    public basePage(WebDriver _driver){
        this.driver = _driver;
    }

    public void loadPage(){

        driver.navigate().to(pageURL);
    }

    public void waitUntilElementExists(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
