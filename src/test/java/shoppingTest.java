import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pajeobject.loginPage;
import pajeobject.headerPage;
import pajeobject.dashboardPage;
import pajeobject.searchPage;
import pajeobject.productPage;
import pajeobject.cartPage;

public class shoppingTest extends baseTest{

    @Test(priority = 2)
    @Parameters({"email", "password", "searchItem"})
    public void searchingAndShoppingItem(String email, String password, String searchItem) {

        loginPage login = new loginPage(baseURL, driver);
        headerPage head = new headerPage(baseURL, driver);
        dashboardPage dash = new dashboardPage(baseURL, driver);
        searchPage search = new searchPage(baseURL, driver);
        productPage produc = new productPage(baseURL, driver);
        cartPage cart = new cartPage(baseURL, driver);
        head.goToLogin();
        login.successfulLogin(email, password);
        dash.waitUntilElementExists(dash.showDashboardPage());
        head.searchItem(searchItem);
        produc.waitUntilElementExists(produc.assertSearchedItem());
        search.clickOnMacbookProItem();
        produc.clickOnAddToCartButton();
        Assert.assertEquals(produc.addedItemToCartMessage().isDisplayed(), true);
        head.clickOnCartButton();
        head.clickOnGoToCartLink();
        Assert.assertEquals(cart.itemAddedToCartPage().isDisplayed(), true);

    }
}
