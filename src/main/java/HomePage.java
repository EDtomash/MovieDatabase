import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class HomePage extends AbstractBasePage<HomePage> {

    private final ElementsCollection MOVIE_BTN = $$x("//div[@id='trending_scroller']//div[@class='card style_1']");
    public MoviePage getMovieBtn() {
        MOVIE_BTN.get(1).click();
        return new MoviePage();
    }
}