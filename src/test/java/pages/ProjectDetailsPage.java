package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

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
}
