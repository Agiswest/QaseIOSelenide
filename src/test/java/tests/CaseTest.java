package tests;

import models.Case;
import models.CaseFactory;
import models.Project;
import models.ProjectFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CaseTest extends BaseTest {
    Project project;

    @Test
    public void testCaseShouldBeCreated() {
        project = ProjectFactory.get();
        projectAdapter.createProject(project);

        Case caseFactory = CaseFactory.get();
        new LoginPage()
                .open()
                .login(user, password)
                .openProject(project.getTitle())
                .createFirstCase()
                .fillInfoOfCase(caseFactory);
    }

    @AfterMethod
    public void deleteProject() {
        projectAdapter.deleteProject(project.getCode());
    }
}
