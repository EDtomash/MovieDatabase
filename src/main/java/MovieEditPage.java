import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Selenide.$;

public class MovieEditPage extends AbstractBasePage <MovieEditPage>{

    private final SelenideElement EDIT_TITLE_FIELD = $(By.id("//input[@id='original_name']"));

    public boolean clickMovieTitle() {
        EDIT_TITLE_FIELD.shouldBe(disabled);
        return true;
    }
}
