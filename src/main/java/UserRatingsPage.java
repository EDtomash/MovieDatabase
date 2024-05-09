import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class UserRatingsPage extends UserBasePage {

    private final ElementsCollection RATING_SCORE_MOVIE = $$x("//span[@class='rating wrapper']/span[@class='value']");

    public String ratingScoreMovie() {
        return RATING_SCORE_MOVIE.get(0).getText();
    }
}
