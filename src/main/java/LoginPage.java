import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends AbstractBasePage<LoginPage> {

    private final SelenideElement USERNAME_FIELD = $(By.id("username"));
    private final SelenideElement PASSWORD_FIELD = $(By.id("password"));
    private final SelenideElement LOGIN_BTN = $(By.id("login_button"));

    public LoginPage setUserName(String userName) {
        getVisibilitiOfElement(USERNAME_FIELD).sendKeys(userName);
        return this;
    }

    public LoginPage setUserPassword(String userPassword) {
        getVisibilitiOfElement(PASSWORD_FIELD).sendKeys(userPassword);
        return this;
    }

    public UserMainPage submitLogin() {
        getVisibilitiOfElement(LOGIN_BTN).click();
        return new UserMainPage();
    }
}
