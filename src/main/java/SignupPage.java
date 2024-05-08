import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignupPage extends AbstractBasePage<SignupPage> {

    private final SelenideElement USERNAME_FIELD = $(By.id("username"));
    private final SelenideElement PASSWORD_FIELD = $(By.id("password"));
    private final SelenideElement PASSWORD_CONFIRM_FIELD = $(By.id("password_confirm"));
    private final SelenideElement EMAIL_FIELD = $(By.id("email"));
    private final SelenideElement SIGNUP_BTN = $(By.id("sign_up_button"));
    private final SelenideElement ACCOUNT_VERIFICATION_MSG = $x("//div[@class='carton']//li");

    public SignupPage setUserName(String username) {
        USERNAME_FIELD.shouldBe(visible, interactable).sendKeys(username);
        return this;
    }

    public SignupPage setPassword(String password) {
        PASSWORD_FIELD.shouldBe(visible, interactable).sendKeys(password);
        return this;
    }

    public SignupPage confirmPassword(String password) {
        PASSWORD_CONFIRM_FIELD.shouldBe(visible, interactable).sendKeys(password);
        return this;
    }

    public SignupPage setEmail(String email) {
        EMAIL_FIELD.shouldBe(visible, interactable).sendKeys(email);
        return this;
    }

    public SignupPage submitRegistration() {
        SIGNUP_BTN.shouldBe(visible).click();
        return this;
    }

    public String getVerificationText() {
        return ACCOUNT_VERIFICATION_MSG.getText();
    }
}
