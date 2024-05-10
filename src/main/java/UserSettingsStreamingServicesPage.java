import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class UserSettingsStreamingServicesPage extends UserSettingsBasePage{

    private final ElementsCollection STREAMING_GLYPHS = $$x("//span[@id='ott_provider_wrapper']//li");

    public void subscribeNetflix() {
        STREAMING_GLYPHS.get(0).click();
    }
}
