import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class AbstractBasePage<T extends AbstractBasePage> {

    private final SelenideElement JOIN_TMDB_REGISTER_BTN = $(By.xpath("//div[@class='flex']//a[@href='/signup']"));
    private final SelenideElement ACCEPT_COOKIES = $(By.id("onetrust-accept-btn-handler"));

    public T acceptAllCookies() {
        ACCEPT_COOKIES.click();
        return (T) this;
    }

    public SignupPage openSignupPage() {
        JOIN_TMDB_REGISTER_BTN.click();
        return new SignupPage();
    }
}