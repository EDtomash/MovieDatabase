import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SettingsBasePage extends AbstractBasePage<SettingsBasePage> {

    private final ElementsCollection SETTINGS_MENU = $$x("//div[@id='settings_menu_scroller']//a");

    public UserStreamingServicesPage openStreamingServicesTab() {
        getListPresentElements(SETTINGS_MENU).get(2).click();
        return new UserStreamingServicesPage();
    }
}
