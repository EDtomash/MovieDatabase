import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class UserSettingsBasePage extends AbstractBasePage<UserSettingsBasePage>{

    private final ElementsCollection SETTINGS_MENU = $$x("//div[@id='settings_menu_scroller']//a");

    public UserSettingsStreamingServicesPage openStreamingServicesTab() {
        SETTINGS_MENU.get(2).click();
        return new UserSettingsStreamingServicesPage();
    }
}
