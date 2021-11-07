package pages;

import io.qameta.allure.Step;
import models.Project;
import org.apache.commons.lang.StringUtils;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CreateProjectPage {

    @Step("Add title and description for project")
    public ProjectDetailsPage addProjectName(Project project) {
        $("#inputTitle").sendKeys(project.getTitle());
        if(StringUtils.isNotEmpty(project.getCode())) {
            $("#inputCode").sendKeys(project.getCode());
        }
        $("#inputDescription").sendKeys(project.getDescription());
        switch (project.getAccess()) {
            case "Private": {
                $("#private-access-type").click();
                break;
            }
            case "Public": {
                $("#public-access-type").click();
                break;
            }
        }
        $(byText("Create project")).click();
        return new ProjectDetailsPage().isOpened();
    }
}
