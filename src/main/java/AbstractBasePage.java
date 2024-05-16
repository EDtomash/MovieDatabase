import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public abstract class AbstractBasePage<T extends AbstractBasePage> extends Waiters {

    private final SelenideElement JOIN_TMDB_REGISTER_BTN = $(By.xpath("//div[@class='flex']//a[@href='/signup']"));
    private final SelenideElement ACCEPT_COOKIES = $(By.id("onetrust-accept-btn-handler"));
    private final SelenideElement MOVIE_BTN = $x("//ul[@data-role='menu']/li[1]/a");
    private final SelenideElement POPULAR_NAV_LINK = $x("//div[@class='k-animation-container']//a[@href='/movie']");
    private final SelenideElement LOGIN_NAV_LINK = $x("//div[@class='flex']//a[@href='/login']");
    private final SelenideElement RATING_TAB = $x("//div[@class='k-tooltip-content']//a[text()='Ratings']");
    private final SelenideElement LOGO_BTN = $x("//a[@class='logo']");
    private final SelenideElement PROFILE_MENU = $(By.className("tooltip_hover"));
    private final SelenideElement USER_LIST_NAV_LINK = $x("//div[@class='k-tooltip-content']//a[text()='Lists']");
    private final SelenideElement WATCHLIST_TAB = $x("//div[@class='k-tooltip-content']//a[text()='Watchlist']");
    private final SelenideElement MOVIE_NAME = $x("//h2[text()='Abigail']");
    private final SelenideElement PROFILE_SETTING_TAB = $x("//div[@class='k-tooltip-content']//a[text()='Settings']");
    private final SelenideElement PROFILE_EDIT_TAB = $x("//div[@class='k-tooltip-content']//a[text()='Edit Profile']");
    private final SelenideElement LOGOUT_BTN = $x("//div[@class='k-tooltip-content']//a[text()='Logout']");
    private final SelenideElement LOGOUT_MESSAGE = $x("(//div[@class='content_wrapper wrap'])[1]");

    public T acceptAllCookies() {
        ACCEPT_COOKIES.shouldBe(visible).click();
        return (T) this;
    }

    public SignupPage openSignupPage() {
        getVisibilitiOfElement(JOIN_TMDB_REGISTER_BTN).click();
        return new SignupPage();
    }

    public LoginPage openLoginPage() {
        getVisibilitiOfElement(LOGIN_NAV_LINK).click();
        return new LoginPage();
    }

    public UserRatingsPage openUserRatingsTab() {
        getVisibilitiOfElement(PROFILE_MENU).click();
        getVisibilitiOfElement(RATING_TAB).click();
        return new UserRatingsPage();
    }

    public HomePage openHomePage() {
        getVisibilitiOfElement(LOGO_BTN).click();
        return new HomePage();
    }

    public UserListPage openUserListPage() {
        getVisibilitiOfElement(PROFILE_MENU).click();
        getVisibilitiOfElement(USER_LIST_NAV_LINK).click();
        return new UserListPage();
    }

    public MoviesSearchPage openPopularMoviePage() {
        getVisibilitiOfElement(MOVIE_BTN).click();
        getVisibilitiOfElement(POPULAR_NAV_LINK).click();
        return new MoviesSearchPage();
    }

    public UserWatchlistPage openUserWatchlistTab() {
        getVisibilitiOfElement(PROFILE_MENU).click();
        getVisibilitiOfElement(WATCHLIST_TAB).click();
        return new UserWatchlistPage();
    }

    public String getNameMovie() {
        return getVisibilitiOfElement(MOVIE_NAME).getText();
    }

    public UserAccountSettingsPage openAccountSettings() {
        getVisibilitiOfElement(PROFILE_MENU).click();
        getVisibilitiOfElement(PROFILE_SETTING_TAB).click();
        return new UserAccountSettingsPage();
    }

    public UserEditProfilePage openEditProfile() {
        getVisibilitiOfElement(PROFILE_MENU).click();
        getVisibilitiOfElement(PROFILE_EDIT_TAB).click();
        return new UserEditProfilePage();
    }

    public HomePage clickLogoutBtn() {
        getVisibilitiOfElement(PROFILE_MENU).click();
        getVisibilitiOfElement(LOGOUT_BTN).click();
        return new HomePage();
    }

    public String getLogoutMessage() {
        return getVisibilitiOfElement(LOGOUT_MESSAGE).getText();
    }
}