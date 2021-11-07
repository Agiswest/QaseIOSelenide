package tests;

import models.*;
import org.testng.annotations.Test;

public class ApiTests extends BaseTest {

    @Test
    public void createNewSuiteTest() {
        Project project = ProjectFactory.get();
        project.setCode("BLABLA");
        Suite suite = SuiteFactory.get();
        projectAdapter.createProject(project);
        suiteAdapter.createSuite(suite, project.getCode());
        Response<Suite> suiteResponse = suiteAdapter.getSuite(project.getCode(), 1);
        System.out.println(suiteResponse);
        suiteAdapter.deleteSuite(project.getCode(), 1);
        projectAdapter.deleteProject(project.getCode());
    }
}
