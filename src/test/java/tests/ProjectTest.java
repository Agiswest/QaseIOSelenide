package tests;

import models.Project;
import models.ProjectFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class ProjectTest extends BaseTest {

    @Test
    public void projectShouldBeCreated() {
        Project project = ProjectFactory.get();
        boolean projectWasCreated = new LoginPage()
                .open()
                .login(user, password)
                .createProject()
                .addProjectName(project)
                .projectIsCreated();
        assertTrue(projectWasCreated, "Project wasn't created");
    }
}
