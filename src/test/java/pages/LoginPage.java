package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final String EMAIL_INPUT_CSS = "#inputEmail";
    private static final String PASSWORD_INPUT_CSS = "#inputPassword";

    @Step("Open login page")
    public LoginPage open() {
        Selenide.open("login");
        $(PASSWORD_INPUT_CSS).shouldBe(Condition.visible);
        return this;
    }

    @Step("Login using credentials")
    public ProjectsPage login(String user, String pass) {
        $(EMAIL_INPUT_CSS).sendKeys(user);
        $(PASSWORD_INPUT_CSS).sendKeys(pass);
        $(PASSWORD_INPUT_CSS).submit();
        return new ProjectsPage().isOpened();
    }
}
