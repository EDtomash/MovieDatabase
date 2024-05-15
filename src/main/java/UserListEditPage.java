import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserListEditPage extends AbstractBasePage<UserListEditPage> {

    private final SelenideElement NAME_FIELD = $(By.id("name"));
    private final SelenideElement DESCRIPTION_FIELD = $(By.id("description"));
    private final SelenideElement CONTINUE_BTN = $(By.id("step_1_submit"));

    public UserListEditPage fillNameField(String title) {
        getVisibilitiOfElement(NAME_FIELD).sendKeys(title);
        return this;
    }

    public UserListEditPage fillDescriptionField(String description) {
        getVisibilitiOfElement(DESCRIPTION_FIELD).sendKeys(description);
        return this;
    }

    public UserListAddItemsPage submitNewList() {
        getVisibilitiOfElement(CONTINUE_BTN).click();
        return new UserListAddItemsPage();
    }
}
