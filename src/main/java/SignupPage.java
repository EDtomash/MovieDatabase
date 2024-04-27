import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignupPage extends AbstractBasePage<SignupPage> {

    private final SelenideElement USERNAME_FIELD = $(By.id("username"));
    private final SelenideElement PASSWORD_FIELD = $(By.id("password"));
    private final SelenideElement PASSWORD_CONFIRM_FIELD = $(By.id("password_confirm"));
    private final SelenideElement EMAIL_FIELD = $(By.id("email"));
    private final SelenideElement SIGNUP_BTN = $(By.id("sign_up_button"));

    public SignupPage setUserName(String username) {
        USERNAME_FIELD.sendKeys(username);
        return this;
    }

    public SignupPage setPassword(String password) {
        PASSWORD_FIELD.sendKeys(password);
        return this;
    }

    public SignupPage confirmPassword(String password) {
        PASSWORD_CONFIRM_FIELD.sendKeys(password);
        return this;
    }

    public SignupPage setEmail(String email) {
        EMAIL_FIELD.sendKeys(email);
        return this;
    }

    public void submitRegistration() {
        SIGNUP_BTN.click();
    }
}
