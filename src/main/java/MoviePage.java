import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MoviePage extends AbstractBasePage<MoviePage> {

    private final SelenideElement VIBE_BTN = $(By.xpath("//div[@id='vibes_label']"));
    private final SelenideElement RATING_SCORE = $(By.xpath("//span[text()='60']"));
    private final SelenideElement DONE_BTN = $(By.xpath("//div[@id='vibes_submit']/span[2]"));
    private final SelenideElement RATINGS_MOVIES_BTN = $x("//ul[@data-role='popup']//li[1]");
    private final SelenideElement ADD_TO_WATCHLIST_BTN = $(By.id("watchlist"));
    private final SelenideElement EDIT_MOVIE_PAGE = $x("//p[@class='rounded new_button pad']");

    public MoviePage clickAddToWatchlist() {
        ADD_TO_WATCHLIST_BTN.click();
        return new MoviePage();
    }

    public MoviePage clickVibeBtn() {
        VIBE_BTN.click();
        return this;
    }

    public MoviePage clickRatingScoreBtn() {
        RATING_SCORE.click();
        return this;
    }

    public MoviePage clickDoneBtn() {
        DONE_BTN.click();
        return this;
    }

    public UserRatingsPage openRatingsPage() {
        RATINGS_MOVIES_BTN.shouldBe(visible, interactable).click();
        return new UserRatingsPage();
    }

    public MovieEditPage openEditMoviePage() {
        EDIT_MOVIE_PAGE.click();
        return new MovieEditPage();
    }
}
