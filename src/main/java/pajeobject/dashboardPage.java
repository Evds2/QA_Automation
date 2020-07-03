package pajeobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage extends basePage{

    private By successfullLoginBanner= By.id("account-account");
    private By successfullRegister = By.xpath("//div[@id=\"content\"]/h1");

    public dashboardPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement showDashboardPage(){

        return driver.findElement(this.successfullLoginBanner);
    }

    public WebElement showSuccessfullRegisterMessage(){

        return driver.findElement(this.successfullRegister);
    }
}
