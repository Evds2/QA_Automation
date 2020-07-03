import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class baseTest {

    public WebDriver driver;
    public String baseURL = "https://demo.opencart.com/";

    //Metodo para preparar el browser
    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void setUpTest(String browser){

        setInitialConfigurartion(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.close();
        try {
            driver.quit();
        }catch (WebDriverException exception){
            System.out.println("Sesion de driver cerrada!!");
        }
    }

    private void setInitialConfigurartion(String browser){
        System.out.println("Before Method Setup");
        if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }
}
