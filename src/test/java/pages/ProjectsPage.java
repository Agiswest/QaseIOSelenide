package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage extends BasePage {
    private static final String CREATE_NEW_PROJECT_BUTTON = "#createButton";
    private static final String SEARCH_FOR_PROJECT_INPUT = "input[type=text]";

    public ProjectsPage isOpened() {
        $(LOADER_LOCATOR).shouldNot(Condition.exist);
        return this;
    }

    @Step("Click create new project button")
    public CreateProjectPage createProject() {
        $(CREATE_NEW_PROJECT_BUTTON).click();
        return new CreateProjectPage();
    }

    @Step("Open project {title}")
    public ProjectDetailsPage openProject(String name) {
        $(SEARCH_FOR_PROJECT_INPUT).clear();
        $(SEARCH_FOR_PROJECT_INPUT).sendKeys(name);
        $("a.defect-title").shouldHave(Condition.text(name)).click();
        return new ProjectDetailsPage().isOpened();
    }

}
