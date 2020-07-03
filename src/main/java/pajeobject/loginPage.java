package pajeobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends basePage{
    private By emailTextBox = By.id("input-email");
    private By loginButton = By.xpath("//input[@type='submit']");;
    private By passwordTextBox = By.id("input-password");
    private By alertMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");


    public loginPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement setEmail(){

        return driver.findElement(this.emailTextBox);
    }

    public WebElement setPassword(){

        return driver.findElement(this.passwordTextBox);
    }

    public WebElement setLoginClick(){

        return driver.findElement(this.loginButton);
    }

    public WebElement showAlertMessage(){
        return driver.findElement(this.alertMessage);
    }


    public void insertEmail(String email){

        setEmail().sendKeys(email);
    }


    public void insertPassword(String password){

        setPassword().sendKeys(password);
    }


    public void clickOnLoginButton(){

        setLoginClick().submit();
    }

    @Step
    public void successfulLogin(String email, String password){

        insertEmail(email);
        insertPassword(password);
        clickOnLoginButton();
    }

}
