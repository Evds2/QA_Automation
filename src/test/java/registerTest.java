import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pajeobject.headerPage;
import pajeobject.dashboardPage;
import pajeobject.registerPage;

public class registerTest extends baseTest{

    @Test(priority = 1)
    @Parameters({"firstName", "lastName", "phone", "password", "confirmPassword"})
    public void registerTest(String firstName, String lastName, String phone,
                             String password, String confirmPassword) {
        headerPage head = new headerPage(baseURL, driver);
        dashboardPage dash = new dashboardPage(baseURL, driver);
        registerPage register = new registerPage(baseURL, driver);
        head.goToRegister();
        register.registerNewUser(firstName, lastName, phone, password, confirmPassword);
        Assert.assertEquals(dash.showSuccessfullRegisterMessage().isDisplayed(), true);
    }
}
