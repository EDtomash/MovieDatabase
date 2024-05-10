import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Selenide.$x;

public class MovieEditPage extends AbstractBasePage <MovieEditPage>{

    private final SelenideElement EDIT_TITLE_FIELD = $x("(//label[@class='k-form-field'])[3]").shouldNotBe(clickable);

    public MovieEditPage clickMovieTitle() {
        EDIT_TITLE_FIELD.click();
        return this;
    }
}
