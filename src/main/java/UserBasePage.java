import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UserBasePage extends AbstractBasePage<UserBasePage> {

    private final SelenideElement USERNAME = $x("//div[@class='about']//h2");
    private final SelenideElement LISTS_NAV_LINK = $x("//ul[@id='new_shortcut_bar']//a[text()='Lists']");

    public UserListPage openListsPage() {
        getVisibilitiOfElement(LISTS_NAV_LINK).click();
        return new UserListPage();
    }

    public String getUserNameFromPage() {
        return getVisibilitiOfElement(USERNAME).getText();
    }
}
