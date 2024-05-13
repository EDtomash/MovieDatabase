import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Selenide.$x;

public class MovieEditPage extends AbstractBasePage <MovieEditPage>{

    private final SelenideElement EDIT_TITLE_FIELD = $x("//input[@id='original_name']");

    public boolean clickMovieTitle() {
        EDIT_TITLE_FIELD.shouldBe(disabled);
        return true;
    }
}
