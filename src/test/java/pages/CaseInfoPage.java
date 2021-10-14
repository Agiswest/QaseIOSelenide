package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import models.Case;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CaseInfoPage {
    private static final String DROP_DOWN_CSS = "#%sGroup>div";
    private static final String DROP_DOWN_OPTIONS_XPATH = "//*[contains(@id, 'option')]";

    @Step("Fill information of test case")
    public ProjectDetailsPage fillInfoOfCase(Case caseInfo) {
        $("#title").sendKeys(caseInfo.getTitle());

        $(String.format(DROP_DOWN_CSS, "status")).click();
        switch (caseInfo.getStatus()) {
            case "Actual": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Actual")).click();
                break;
            }
            case "Draft": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Draft")).click();
                break;
            }
            case "Deprecated": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Deprecated")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "severity")).click();
        switch (caseInfo.getSeverity()) {
            case "Normal": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Normal")).click();
                break;
            }
            case "Not set": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Not set")).click();
                break;
            }
            case "Blocker": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Blocker")).click();
                break;
            }
            case "Critical": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Critical")).click();
                break;
            }
            case "Major": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Major")).click();
                break;
            }
            case "Minor": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Minor")).click();
                break;
            }
            case "Trivial": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Trivial")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "priority")).click();
        switch (caseInfo.getPriority()) {
            case "Not set": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Not set")).click();
                break;
            }
            case "High": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("High")).click();
                break;
            }
            case "Medium": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Medium")).click();
                break;
            }
            case "Low": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Low")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "type")).click();
        switch (caseInfo.getType()) {
            case "Other": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Other")).click();
                break;
            }
            case "Functional": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Functional")).click();
                break;
            }
            case "Smoke": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Smoke")).click();
                break;
            }
            case "Regression": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Regression")).click();
                break;
            }
            case "Security": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Security")).click();
                break;
            }
            case "Usability": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Usability")).click();
                break;
            }
            case "Performance": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Performance")).click();
                break;
            }
            case "Acceptance": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Acceptance")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "layer")).click();
        switch (caseInfo.getLayer()) {
            case "Unknown": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Unknown")).click();
                break;
            }
            case "E2E": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("E2E")).click();
                break;
            }
            case "API": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("API")).click();
                break;
            }
            case "Unit": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Unit")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "is_flaky")).click();
        switch (caseInfo.getIsFlaky()) {
            case "Yes": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Yes")).click();
                break;
            }
            case "No": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("No")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "behavior")).click();
        switch (caseInfo.getBehavior()) {
            case "Not set": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Not set")).click();
                break;
            }
            case "Positive": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Positive")).click();
                break;
            }
            case "Negative": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Negative")).click();
                break;
            }
            case "Destructive": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Destructive")).click();
                break;
            }
        }

        $(String.format(DROP_DOWN_CSS, "automationStatus")).click();
        switch (caseInfo.getAutomationStatus()) {
            case "Not automated": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Not automated")).click();
                break;
            }
            case "To be automated": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("To be automated")).click();
                break;
            }
            case "Automated": {
                $$(By.xpath(DROP_DOWN_OPTIONS_XPATH)).find(Condition.text("Automated")).click();
                break;
            }
        }

        $("#save-case").click();
        return new ProjectDetailsPage().isOpened();
    }


}
