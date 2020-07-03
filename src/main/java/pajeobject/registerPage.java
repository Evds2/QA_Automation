package pajeobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class registerPage extends basePage{

    private By firstNameinput = By.xpath("//*[@name=\"firstname\"]");
    private By lastNameInput = By.xpath("//*[@name=\"lastname\"]");
    private By emailInput = By.xpath("//*[@name=\"email\"]");
    private By phoneInput = By.xpath("//*[@name=\"telephone\"]");
    private By passwordInput = By.id("input-password");
    private By confirmPasswordInput = By.id("input-confirm");
    private By policyCheckBox = By.xpath("//*[@name=\"agree\"]");
    private By continueButton = By.xpath("//*[@type=\"submit\"]");


    public registerPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement setFirstName(){

        return driver.findElement(this.firstNameinput);
    }

    public WebElement setLastName(){

        return driver.findElement(this.lastNameInput);
    }

    public WebElement setEmail(){

        return driver.findElement(this.emailInput);
    }

    public WebElement setPhone(){

        return driver.findElement(this.phoneInput);
    }

    public WebElement setPassword(){

        return driver.findElement(this.passwordInput);
    }

    public WebElement setConfirmPassword(){

        return driver.findElement(this.confirmPasswordInput);
    }

    public void insertFirstName(String firstName){

        setFirstName().sendKeys(firstName);
    }

    public void insertLastName(String lastName){

        setLastName().sendKeys(lastName);
    }

    public void insertEmail(String email){

        setEmail().sendKeys(email);
    }

    public void insertPhone(String phone){

        setPhone().sendKeys(phone);
    }

    public void insertPassword(String password){

        setPassword().sendKeys(password);
    }

    public void insertConfirmPassword(String confirmPassword){

        setConfirmPassword().sendKeys(confirmPassword);
    }

    public void clickOnPoliciesCheckBox(){

        driver.findElement(this.policyCheckBox).click();
    }

    public void clickOnContinueButton(){

        driver.findElement(this.continueButton).click();
    }

    @Step
    public void registerNewUser(String firstName, String lastName, String phone, String password,
                                String confirmPassword){

        insertFirstName(firstName);
        insertLastName(lastName);
        insertEmail(getRandomEmailGenerator());
        insertPhone(phone);
        insertPassword(password);
        insertConfirmPassword(confirmPassword);
        clickOnPoliciesCheckBox();
        clickOnContinueButton();
    }

    protected String getRandomEmailGenerator(){
        String alphaNumbers = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rndm = new Random();
        while (salt.length() < 8) {
            int index = (int) (rndm.nextFloat() * alphaNumbers.length());
            salt.append(alphaNumbers.charAt(index));
        }
        String saltStr = salt.toString();
        return String.format("%s@testmail.com", saltStr);
    }
}
