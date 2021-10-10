package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProjectsPage {

    public ProjectsPage isOpened() {
        $("#createButton").shouldBe(Condition.visible);
        return this;
    }

    public CreateProjectPage createProject() {
        $("#createButton").click();
        return new CreateProjectPage();
    }

    public ProjectDetailsPage openProject(String name) {
        $$("a.defect-title").find(Condition.text(name)).click();
        return new ProjectDetailsPage().isOpened();
    }

}
