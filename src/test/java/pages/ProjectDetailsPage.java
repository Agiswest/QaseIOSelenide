package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProjectDetailsPage {

    public boolean projectIsCreated() {
        try {
            $(By.xpath("//*[@class='alert-message']"))
                    .shouldHave(Condition.text("was created successfully"));
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    public ProjectDetailsPage isOpened() {
        try {
            $$("a.btn").find(Condition.text("Case")).shouldBe(Condition.visible);
        } catch (Exception e) {
            $$("a.btn").find(Condition.text("Create new case")).shouldBe(Condition.visible);
        }
        return this;
    }

    @Step("Click on create new case button")
    public CaseInfoPage createNewCase() {
        try {
            $$("a.btn").find(Condition.text("Case")).click();
        } catch (Exception e) {
            $$("a.btn").find(Condition.text("Create new case")).click();
        }
        return new CaseInfoPage();
    }
}
