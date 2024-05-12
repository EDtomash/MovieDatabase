import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class UserStreamingServicesPage extends SettingsBasePage {

    private final SelenideElement SUBSCRIBED_PROVIDER = $x("//ul[@id='selected_ott_providers']/li[1]//img");
    private final ElementsCollection STREAMING_PROVIDERS = $$x("//ul[@id='ott_providers']//a");

    public void subscribeToNetflix() {
        STREAMING_PROVIDERS.get(0).click();
    }

    public String checkNetflixSub() {
        return SUBSCRIBED_PROVIDER.getAttribute("alt");
    }
}
