package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProjectsPage extends BasePage {
    private static final String CREATE_NEW_PROJECT_BUTTON = "#createButton";
    private static final String ALL_PROJECTS_ON_PAGE = "a.defect-title";

    public ProjectsPage isOpened() {
        $(LOADER_LOCATOR).shouldNot(Condition.exist);
        return this;
    }

    @Step("Click create new project button")
    public CreateProjectPage createProject() {
        $(CREATE_NEW_PROJECT_BUTTON).click();
        return new CreateProjectPage();
    }

    @Step("Open project {name}")
    public ProjectDetailsPage openProject(String name) {
        $$(ALL_PROJECTS_ON_PAGE).find(Condition.text(name)).click();
        return new ProjectDetailsPage().isOpened();
    }

}
