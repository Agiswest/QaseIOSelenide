package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import models.Case;
import wrappers.Dropdown;

import static com.codeborne.selenide.Selenide.$;

public class CaseFormPage extends BasePage {
    private static final String TITLE_LOCATOR = "#title";
    private static final String SAVE_CASE_LOCATOR = "#save-case";

    public CaseFormPage isOpened() {
        $(LOADER_LOCATOR).shouldNot(Condition.exist);
        return this;
    }

    @Step("Fill information of test case")
    public ProjectDetailsPage fillInfoOfCase(Case caseInfo) {
        $(TITLE_LOCATOR).sendKeys(caseInfo.getTitle());
        new Dropdown("status").select(caseInfo.getStatus());
        new Dropdown("severity").select(caseInfo.getSeverity());
        new Dropdown("priority").select(caseInfo.getPriority());
        new Dropdown("type").select(caseInfo.getType());
        new Dropdown("layer").select(caseInfo.getLayer());
        new Dropdown("is_flaky").select(caseInfo.getIsFlaky());
        new Dropdown("behavior").select(caseInfo.getBehavior());
        new Dropdown("automationStatus").select(caseInfo.getAutomationStatus());
        $(SAVE_CASE_LOCATOR).click();
        return new ProjectDetailsPage().isOpened();
    }


}
