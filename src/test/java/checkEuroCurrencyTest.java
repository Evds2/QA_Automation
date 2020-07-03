import org.testng.Assert;
import org.testng.annotations.Test;
import pajeobject.dashboardPage;
import pajeobject.headerPage;
import pajeobject.productPage;
import pajeobject.searchPage;
import pajeobject.loginPage;
import pojo.euroCurrencyData;
import dataproviders.euroCurrencyProvider;

public class checkEuroCurrencyTest extends baseTest{

    @Test(dataProvider = "getEuroCurrencyFromJson", dataProviderClass =  euroCurrencyProvider.class, priority = 3)
    public void checkEuroCurrency(euroCurrencyData _currency) throws InterruptedException {

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
        head.clickOnEuroCurrency();

        Assert.assertEquals(produc.returnCurrencyValue().getText(), _currency.getEuroCurrency());
    }
}
