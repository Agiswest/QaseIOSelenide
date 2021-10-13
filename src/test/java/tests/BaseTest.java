package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyReader;

public class BaseTest {
    String user;
    String password;

    @BeforeMethod
    public void setup() {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.baseUrl = PropertyReader.getProperty("qase.url");
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.clickViaJs = false;
        user = PropertyReader.getProperty("qase.user");
        password = PropertyReader.getProperty("qase.pass");
    }

    @AfterMethod
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }
}
