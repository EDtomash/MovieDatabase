import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MoviesSearchPage extends AbstractBasePage<MoviesSearchPage> {

    private final SelenideElement SORT_DROPDOWN = $x("//div[@class='filter_panel card closed'][1]//h2");
    private final SelenideElement GENRES_ACTION = $x("//ul[@id='with_genres']/li[1]");
    private final SelenideElement CERTIFICATION_R = $x("//ul[@id='certification']/li[@data-value='R']/a");
    private final SelenideElement LANGUAGE_DROPDOWN = $x("//span[@class='k-widget k-dropdown full_width font_size_1']");
    private final SelenideElement SEARCH_BTN = $x("//div[@class='apply small background_color light_blue enabled']//a");
    private final ElementsCollection MOVIES_LIST = $$x("//div[@id='page_1']//h2");

    public MoviesSearchPage ascendingSort() {
        SORT_DROPDOWN.click();
        $(By.id("sort_by")).selectOptionByValue("title.asc");
        return this;
    }

    public MoviesSearchPage selectGenresAction() {
        GENRES_ACTION.click();
        return this;
    }

    public MoviesSearchPage selectCertificationR() {
        CERTIFICATION_R.scrollTo().shouldBe(visible).click();
        return this;
    }

    public MoviesSearchPage selectLanguageJapanese() {
        LANGUAGE_DROPDOWN.click();
        $(By.id("language")).selectOptionByValue("ja");
        return this;
    }

    public MoviesSearchPage clickOnSearch() {
        SEARCH_BTN.scrollTo().shouldBe(visible).click();
        return this;
    }

    public String getMovieTitleFromResults() {
        return MOVIES_LIST.get(0).getText();
    }
}
