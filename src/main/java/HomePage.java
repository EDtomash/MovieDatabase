import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class HomePage extends AbstractBasePage<HomePage> {

    private final ElementsCollection MOVIE_BTN = $$x("//div[@id='trending_scroller']//div[@class='card style_1']");
    public MoviePage getMovieBtn() {
        MOVIE_BTN.get(10).click();
        return new MoviePage();
    }
}