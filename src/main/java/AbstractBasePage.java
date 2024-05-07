import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public abstract class AbstractBasePage<T extends AbstractBasePage> {

    private final SelenideElement JOIN_TMDB_REGISTER_BTN = $(By.xpath("//div[@class='flex']//a[@href='/signup']"));
    private final SelenideElement ACCEPT_COOKIES = $(By.id("onetrust-accept-btn-handler"));
    private final SelenideElement LOGIN_NAV_LINK = $x("//div[@class='flex']//a[@href='/login']");
    private final SelenideElement USER_PROFILE_DROPDOWN = $(By.className("tooltip_hover"));
    private final SelenideElement RATING_TAB = $x("//div[@class='k-tooltip-content']//a[text()='Ratings']");
    private final SelenideElement LOGO_BTN = $x("//a[@class='logo']");

    public T acceptAllCookies() {
        ACCEPT_COOKIES.click();
        return (T) this;
    }

    public SignupPage openSignupPage() {
        JOIN_TMDB_REGISTER_BTN.click();
        return new SignupPage();
    }

    public LoginPage openLoginPage() {
        LOGIN_NAV_LINK.click();
        return new LoginPage();
    }

    public UserRatingsPage openUserRatingsTab() {
        USER_PROFILE_DROPDOWN.click();
        RATING_TAB.click();
        return new UserRatingsPage();
    }

    public HomePage openHomePage() {
        LOGO_BTN.click();
        return new HomePage();
    }
}