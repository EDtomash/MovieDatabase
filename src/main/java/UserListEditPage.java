import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class UserListEditPage extends AbstractBasePage<UserListEditPage> {

    private final SelenideElement NAME_FIELD = $(By.id("name"));
    private final SelenideElement DESCRIPTION_FIELD = $(By.id("description"));
    private final SelenideElement CONTINUE_BTN = $(By.id("step_1_submit"));

    public UserListEditPage fillNameField(String title) {
        NAME_FIELD.shouldBe(visible, interactable).sendKeys(title);
        return this;
    }

    public UserListEditPage fillDescriptionField(String description) {
        DESCRIPTION_FIELD.shouldBe(visible, interactable).sendKeys(description);
        return this;
    }

    public UserListAddItemsPage submitNewList() {
        CONTINUE_BTN.shouldBe(visible).click();
        return new UserListAddItemsPage();
    }
}
