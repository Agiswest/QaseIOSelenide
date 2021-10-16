package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class ProjectDetailsPage extends BasePage {
    private static final String ALERT_MESSAGE_LOCATOR = "//*[@class='alert-message']";
    private static final String ALL_BUTTONS = "a.btn";
    private static final String CREATE_CASE_LOCATOR = "#create-case-button";

    public boolean projectIsCreated() {
        try {
            $x(ALERT_MESSAGE_LOCATOR)
                    .shouldHave(Condition.text("was created successfully"));
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    public ProjectDetailsPage isOpened() {
        $(LOADER_LOCATOR).shouldNot(Condition.exist);
        return this;
    }

    @Step("Click on button to create new case")
    public CaseFormPage createFirstCase() {
        $(byText("Create new case")).click();
        return new CaseFormPage().isOpened();
    }

    @Step("Create one more case")
    public CaseFormPage createCase() {
        $(CREATE_CASE_LOCATOR).click();
        return new CaseFormPage().isOpened();
    }
}
