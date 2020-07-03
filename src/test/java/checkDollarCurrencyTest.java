import org.testng.Assert;
import org.testng.annotations.Test;
import pajeobject.*;
import pojo.dollarCurrencyData;
import dataproviders.dollarCurrencyProvider;

public class checkDollarCurrencyTest extends baseTest{

    @Test(dataProvider = "getDollarCurrencyFromJson", dataProviderClass = dollarCurrencyProvider.class, priority = 5)
    public void checkDollarCurrency(dollarCurrencyData _currency){

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
        head.clickOnDollarCurrency();

        Assert.assertEquals(produc.returnCurrencyValue().getText(), _currency.getDollarCurrency());

    }
}
