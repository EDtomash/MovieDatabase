import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class UserRatingsPage extends AbstractBasePage<UserWatchlistPage>{
    private final ElementsCollection RATING_SCORE_MOVIE = $$x("//span[@class='rating wrapper']/span[@class='value']");

    public String ratingScoreMovie() {
        return RATING_SCORE_MOVIE.get(0).getText();
    }
}
