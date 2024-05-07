import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends AbstractBasePage<LoginPage> {

    private final SelenideElement USERNAME_FIELD = $(By.id("username"));
    private final SelenideElement PASSWORD_FIELD = $(By.id("password"));
    private final SelenideElement LOGIN_BTN = $(By.id("login_button"));

    public LoginPage setUserName(String userName) {
        USERNAME_FIELD.shouldBe(visible, interactable).sendKeys(userName);
        return this;
    }

    public LoginPage setUserPassword(String userPassword) {
        PASSWORD_FIELD.shouldBe(visible, interactable).sendKeys(userPassword);
        return this;
    }

    public UserMainPage submitLogin() {
        LOGIN_BTN.shouldBe(visible).click();
        return new UserMainPage();
    }
}
