package tests;

import adapters.ProjectAdapter;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyReader;

public class BaseTest {
    String user;
    String password;
    ProjectAdapter projectAdapter;

    @BeforeMethod
    public void setup() {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL",
                PropertyReader.getProperty("qase.url"));
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.clickViaJs = false;
        user = System.getenv().getOrDefault("QASE_USER",
                PropertyReader.getProperty("qase.user"));
        password = System.getenv().getOrDefault("QASE_PASS",
                PropertyReader.getProperty("qase.pass"));
        projectAdapter = new ProjectAdapter();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .includeSelenideSteps(false)
                .screenshots(true));
    }

    @AfterMethod
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }
}
