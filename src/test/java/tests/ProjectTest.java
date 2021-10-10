package tests;

import models.Project;
import models.ProjectFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ProjectTest extends BaseTest {

    @Test
    public void projectShouldBeCreated() {
        Project project = ProjectFactory.get();
        boolean projectWasCreated = new LoginPage()
                .open()
                .login("maximus200064@mail.ru", "testPassMax1")
                .createProject()
                .addProjectName(project)
                .projectIsCreated();
        Assert.assertTrue(projectWasCreated, "Project wasn't created");

    }
}
