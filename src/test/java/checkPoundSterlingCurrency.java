import org.testng.Assert;
import org.testng.annotations.Test;
import pajeobject.*;
import pojo.poundSterlingCurrencyData;
import dataproviders.poundSterlingCurrencyProvider;

public class checkPoundSterlingCurrency extends baseTest{

    @Test(dataProvider = "getPoundSterlingCurrency", dataProviderClass = poundSterlingCurrencyProvider.class, priority = 4)
    public void checkPoundSterlingCurrency(poundSterlingCurrencyData _currency){

        dashboardPage dash = new dashboardPage(baseURL, driver);
        headerPage head = new headerPage(baseURL, driver);
        productPage produc = new productPage(baseURL, driver);
        searchPage search = new searchPage(baseURL, driver);
        loginPage login = new loginPage(baseURL, driver);

        head.goToLogin();

        login.insertEmail(_currency.getEmail());
        login.insertPassword(_currency.getPassword());
        login.clickOnLoginButton();
        login.waitUntilElementExists(dash.showDashboardPage());
        head.searchItem(_currency.getSearchItem());
        search.clickOnIphoneItem();
        head.clickOnCurrenciesDropDown();
        head.clickOnPoundSterlingCurrency();

        //System.out.println(produc.returnCurrencyValue().getText());
        Assert.assertEquals(produc.returnCurrencyValue().getText(), _currency.getPoundSterlingCurrency());

    }
}
