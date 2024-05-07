import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public abstract class AbstractBasePage<T extends AbstractBasePage> {

    private final SelenideElement JOIN_TMDB_REGISTER_BTN = $(By.xpath("//div[@class='flex']//a[@href='/signup']"));
    private final SelenideElement ACCEPT_COOKIES = $(By.id("onetrust-accept-btn-handler"));
    private final SelenideElement LOGIN_NAV_LINK = $x("//div[@class='flex']//a[@href='/login']");
    private final SelenideElement PROFILE_MENU = $(By.className("tooltip_hover"));
    private final SelenideElement USER_LIST_NAV_LINK = $x("//div[@class='k-tooltip-content']//a[text()='Lists']");

    public T acceptAllCookies() {
        ACCEPT_COOKIES.shouldBe(visible).click();
        return (T) this;
    }

    public SignupPage openSignupPage() {
        JOIN_TMDB_REGISTER_BTN.shouldBe(visible).click();
        return new SignupPage();
    }

    public LoginPage openLoginPage() {
        LOGIN_NAV_LINK.shouldBe(visible).click();
        return new LoginPage();
    }

    public UserListPage openUserListPage() {
        PROFILE_MENU.shouldBe(visible, interactable).click();
        USER_LIST_NAV_LINK.shouldBe(visible, interactable).click();
        return new UserListPage();
    }
}