package tests;

import models.Case;
import models.CaseFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CaseTest extends BaseTest {

    @Test
    public void testCaseShouldBeCreated() {
        Case caseFactory = CaseFactory.get();
        new LoginPage()
                .open()
                .login("maximus200064@mail.ru", "testPassMax1")
                .openProject("AQA_PROJECT_DO_NOT_TOUCH")
                .createNewCase()
                .fillInfoOfCase(caseFactory);


    }
}
